package com.edu.seiryo;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.json.JacksonJsonObjectMarshaller;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonFileItemWriter;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonFileItemWriterBuilder;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

import com.fasterxml.jackson.databind.ObjectMapper;

//@EnableBatchProcessing
//@SpringBootApplication
public class JsonWriteJob {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Bean
	public FlatFileItemReader<User> userItemReader(){
		return new FlatFileItemReaderBuilder<User>()
				.name("userItemReader")
				.resource(new ClassPathResource("user.txt"))
				.delimited().delimiter("#")
				.names("id", "name", "age")
				.targetType(User.class)
				.build();
	}
	@Bean
	public JacksonJsonObjectMarshaller<User> objectMarshaller(){
		JacksonJsonObjectMarshaller marshaller = new JacksonJsonObjectMarshaller();	
		return marshaller;
	}
	@Bean
    public JsonFileItemWriter<User> itemWriter(){
        return new JsonFileItemWriterBuilder<User>()
                .name("jsonUserItemWriter")
                .resource(new PathResource("d:/outUser.json"))
                .jsonObjectMarshaller(objectMarshaller())
                .build();
    }


    @Bean
    public Step step(){
        return stepBuilderFactory.get("step1")
                .<User, User>chunk(1)
                .reader(userItemReader())
                .writer(itemWriter())
                .build();

    }

    @Bean
    public Job job(){
        return jobBuilderFactory.get("json-writer-job")
                .start(step())
                .build();
    }
	public static void main(String[] args) {
		SpringApplication.run(JsonWriteJob.class, args);
	}
}
