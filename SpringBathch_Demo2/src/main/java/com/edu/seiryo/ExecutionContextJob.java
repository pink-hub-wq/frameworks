package com.edu.seiryo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//@EnableBatchProcessing
public class ExecutionContextJob {
	// job构造器工厂
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	// step构造器工厂
	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	// 任务-step执行逻辑由tasklet完成
	@Bean
	public Tasklet tasklet() {
		return new Tasklet() {
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				ExecutionContext stepExecutionContext = chunkContext.getStepContext().getStepExecution()
						.getExecutionContext();
				stepExecutionContext.put("key-step1-step", "value-step1-step");
				System.out.println("------------------1---------------------------");
				ExecutionContext jobExecutionContext = chunkContext.getStepContext().getStepExecution()
						.getJobExecution().getExecutionContext();
				jobExecutionContext.put("key-step1-job", "value-step1-job");
				return RepeatStatus.FINISHED;
			}
		};
	}
	 @Bean
	    public Tasklet tasklet2(){
	        return new Tasklet() {
	            @Override
	            public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
	                ExecutionContext stepExecutionContext = chunkContext.getStepContext().getStepExecution().getExecutionContext();
	                System.out.println(stepExecutionContext.get("key-step1-step"));
	                System.out.println("------------------2---------------------------");
	                ExecutionContext jobExecutionContext = chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
	                System.out.println(jobExecutionContext.get("key-step1-job"));
	                return RepeatStatus.FINISHED;
	            }
	        };
	    }
	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").tasklet(tasklet()).build();
	}
	@Bean
	public Step step2() {
		return stepBuilderFactory.get("step2").tasklet(tasklet2()).build();
	}
	@Bean
	public Job job() {
		return jobBuilderFactory.get("hello-job1").start(step1()).next(step2()).incrementer(new RunIdIncrementer()).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ExecutionContextJob.class, args);
	}

}
