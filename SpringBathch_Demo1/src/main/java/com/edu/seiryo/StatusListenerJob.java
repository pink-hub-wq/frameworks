package com.edu.seiryo;

import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.listener.JobListenerFactoryBean;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBatchProcessing
public class StatusListenerJob {
	 @Autowired
	    private JobBuilderFactory jobBuilderFactory;
	    @Autowired
	    private StepBuilderFactory stepBuilderFactory;

	    @Bean
	    public Tasklet tasklet(){
	        return new Tasklet() {
	            @Override
	            public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
	            	Map<String, Object> parameters = chunkContext.getStepContext().getJobParameters();
	                System.out.println("params---run.id:" + parameters.get("run.id"));
	                JobExecution jobExecution = contribution.getStepExecution().getJobExecution();
	                System.err.println("执行中-status：" + jobExecution.getStatus());
	                return RepeatStatus.FINISHED;
	            }
	        };
	    }

	    //状态监听器
//	    @Bean
//	    public JobStateListener jobStateListener(){
//	        return new JobStateListener();
//	    }

	    @Bean
	    public Step  step1(){
	        return  stepBuilderFactory.get("step2")
	                .tasklet(tasklet())
	                .build();
	    }
	    @Bean
	    public Job job(){
	        return jobBuilderFactory.get("status-listener-job2")
	                .start(step1())
	                //.listener(jobStateListener())  //设置状态监听器
	                .incrementer(new RunIdIncrementer()) 
	                .listener(JobListenerFactoryBean.getListener(new JobStateAnnoListener()))
	                .build();
	    }
	    public static void main(String[] args) {
	        SpringApplication.run(StatusListenerJob.class, args);
	    }
}
