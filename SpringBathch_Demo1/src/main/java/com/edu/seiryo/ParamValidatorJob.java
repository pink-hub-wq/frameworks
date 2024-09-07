package com.edu.seiryo;

import java.util.Arrays;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.DefaultJobParametersValidator;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//@EnableBatchProcessing
public class ParamValidatorJob {
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
                System.out.println("params---name:" + parameters.get("name"));
                System.out.println("params---age:" + parameters.get("age"));
                return RepeatStatus.FINISHED;
            }
        };
    }

    @Bean
    public Step  step1(){
        return  stepBuilderFactory.get("step3")
                .tasklet(tasklet())
                .build();
    }

//    //配置name参数校验器
//    @Bean
//    public NameParamValidator validator(){
//        return new NameParamValidator();
//    }
//  //配置默认参数校验器
//    @Bean
//    public DefaultJobParametersValidator defaultValidator(){
//        DefaultJobParametersValidator defaultValidator = new DefaultJobParametersValidator();
//        defaultValidator.setRequiredKeys(new String[]{"name"});  //必填
//        defaultValidator.setOptionalKeys(new String[]{"age"});   //可选
//        return defaultValidator;
//    }
  //配置组合参数校验器
    @Bean
    public CompositeJobParametersValidator compositeValidator(){

        DefaultJobParametersValidator defaultValidator = new DefaultJobParametersValidator();
        defaultValidator.setRequiredKeys(new String[]{"name"});  //name必填
        defaultValidator.setOptionalKeys(new String[]{"age"});   //age可选

        NameParamValidator nameParamValidator = new NameParamValidator();  //name 不能为空

        CompositeJobParametersValidator compositeValidator = new CompositeJobParametersValidator();
        //按照传入的顺序，先执行defaultValidator 后执行nameParamValidator
        compositeValidator.setValidators(Arrays.asList(defaultValidator, nameParamValidator));

        try {
            compositeValidator.afterPropertiesSet();  //判断校验器是否为null
        } catch (Exception e) {
            e.printStackTrace();
        }

        return compositeValidator;
    }

    @Bean
    public Job job(){
        return jobBuilderFactory.get("name-param-validator-job3")
                .start(step1())
                //.validator(validator())  //参数校验器
                //.validator(defaultValidator())  //默认参数校验器
                .validator(compositeValidator())  //组合参数校验器
                .build();
    }
    public static void main(String[] args) {
        SpringApplication.run(ParamValidatorJob.class, args);
    }
}
