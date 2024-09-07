package com.edu.seiryo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableBatchProcessing
//@Configuration
public class BatchConfig {
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Bean
	public Tasklet tasklet() {
		return new Tasklet() {
			
			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				System.out.println("BatchConfig");
				return RepeatStatus.FINISHED;
			}
		};
	}
	@Bean
	public Step step() {
		return stepBuilderFactory.get("step1")
				.tasklet(tasklet())
				.build();
	}
	@Bean
	public Job job() {
		return jobBuilderFactory.get("hello-restful-job")
				.start(step())
				.incrementer(new RunIdIncrementer())
				.build();
	}
}
