package com.edu.seiryo;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//@EnableBatchProcessing
public class ChunkTaskletJob {
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	int timer = 10;

	@Bean
	public ItemReader itemReader() {
		return new ItemReader() {
			@Override
			public Object read()
					throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

				if (timer > 0) {
					System.out.println("-------------read------------");
					return "read-ret-" + timer--;
				} else {
					return null;
				}

			}
		};
	}

	@Bean
	public ItemProcessor itemProcessor() {
		return new ItemProcessor() {
			@Override
			public Object process(Object item) throws Exception {
				System.out.println("-------------process------------>" + item);
				return "process-ret->" + item;
			}
		};
	}

	@Bean
	public ItemWriter itemWriter() {
		return new ItemWriter() {
			@Override
			public void write(List items) throws Exception {
				System.out.println(items);
			}
		};
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").chunk(3)
				.reader(itemReader()).processor(itemProcessor()).writer(itemWriter()).build();
	}

	@Bean
	public Job job() {
		return jobBuilderFactory.get("step-chunk-tasklet-job").start(step1()).incrementer(new RunIdIncrementer())
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ChunkTaskletJob.class, args);
	}
}
