package com.edu.seiryo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

//@SpringBootApplication
//@EnableBatchProcessing
public class JsonFlatReaderJob {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
    public JsonItemReader<User3> User3ItemReader(){

    	ObjectMapper objectMapper = new ObjectMapper();
    	JacksonJsonObjectReader<User3> jsonObjectReader = new JacksonJsonObjectReader<>(User3.class);
        jsonObjectReader.setMapper(objectMapper);

        return new JsonItemReaderBuilder<User3>()
                .name("User3JsonItemReader")
                .jsonObjectReader(jsonObjectReader)
                .resource(new ClassPathResource("user3.json"))
            .build();
	}

    @Bean
    public ItemWriter<User3> itemWriter(){
        return new ItemWriter<User3>() {
            @Override
            public void write(List<? extends User3> items) throws Exception {
                items.forEach(System.err::println);
            }
        };
    }

    @Bean
    public Step step(){
        return stepBuilderFactory.get("step1")
                .<User3, User3>chunk(1)
                .reader(User3ItemReader())
                .writer(itemWriter())
                .build();

    }

    @Bean
    public Job job(){
        return jobBuilderFactory.get("json-flat-reader-job")
                .start(step())
                .build();
    }
    public static void main(String[] args) {
        SpringApplication.run(JsonFlatReaderJob.class, args);
    }
}
