package com.edu.seiryo;

import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
//@SpringBootApplication
//@EnableBatchProcessing
public class ParamJob {
	//job构造器工厂
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    //step构造器工厂
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @StepScope
    @Bean
    public Tasklet tasklet(@Value("#{jobParameters['name']}")String name){
        return new Tasklet() {
            public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
            	//Map<String, Object> parameters = chunkContext.getStepContext().getJobParameters();
                //System.out.println("params---name:" + parameters.get("name"));
            	System.out.println("params---name:" + name);
                return RepeatStatus.FINISHED;
            }
        };
    }
    @Bean
    public Step  step1(){
        return  stepBuilderFactory.get("step9")
                .tasklet(tasklet(null))
                .build();
    }
    @Bean
    public Job job(){
        return jobBuilderFactory.get("param-job9")
                .start(step1())
                .build();
    }
    public static void main(String[] args) {
        SpringApplication.run(ParamJob.class, args);
    }
}
