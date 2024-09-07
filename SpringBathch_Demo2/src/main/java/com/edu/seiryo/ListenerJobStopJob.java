package com.edu.seiryo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@EnableBatchProcessing
//@SpringBootApplication
public class ListenerJobStopJob {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	private int readCount = 100;

	@Bean
	public Tasklet tasklet() {
		return new Tasklet() {

			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				for (int i = 1; i <= readCount; i++) {
					System.out.println("---------------step1执行-" + i + "------------------");
					ResouceCount.readCount++;
				}
				return RepeatStatus.FINISHED;
			}
		};
	}

	@Bean
	public Tasklet tasklet2() {
		return new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				System.out.println("step2执行了.......");
				System.out.println("readCount:" + ResouceCount.readCount + ", totalCount:" + ResouceCount.totalCount);
				return RepeatStatus.FINISHED;
			}
		};
	}

	@Bean
	public StopStepListener stopStepListener() {
		return new StopStepListener();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").tasklet(tasklet()).listener(stopStepListener())
				.allowStartIfComplete(true).build();
	}

	@Bean
	public Step step2() {
		return stepBuilderFactory.get("step2").tasklet(tasklet2()).build();
	}

	@Bean
	public Job jpb() {
		return jobBuilderFactory.get("job-stop-job").start(step1()).on("STOPPED").stopAndRestart(step1()).from(step1())
				.on("*").to(step2()).end().build();
	}
	public static void main(String[] args) {
		SpringApplication.run(ListenerJobStopJob.class, args);
	}
}
