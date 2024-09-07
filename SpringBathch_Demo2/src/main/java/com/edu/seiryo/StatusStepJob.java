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
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@EnableBatchProcessing
//@SpringBootApplication
public class StatusStepJob {

  //job构造工厂---用于构建job对象
  @Autowired
  private JobBuilderFactory jobBuilderFactory;

  //step 构造工厂--用于构造step对象
  @Autowired
  private StepBuilderFactory stepBuilderFactory;

  @Bean
  public Tasklet firstTasklet(){
      return new Tasklet() {
          @Override
          public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

              System.out.println("----------------firstTasklet---------------");

              //throw new RuntimeException("假装失败了");
              return RepeatStatus.FINISHED;
          }
      };
  }

  @Bean
  public Tasklet successTasklet(){
      return new Tasklet() {
          @Override
          public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

              System.out.println("----------------successTasklet--------------");

              return RepeatStatus.FINISHED;
          }
      };
  }
  @Bean
  public Tasklet failTasklet(){
      return new Tasklet() {
          @Override
          public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

              System.out.println("----------------failTasklet---------------");

              return RepeatStatus.FINISHED;
          }
      };
  }

  @Bean
  public Step firstStep(){
      return stepBuilderFactory.get("firstStep")
              .tasklet(firstTasklet())
              .build();
  }
  @Bean
  public Step successStep(){
      return stepBuilderFactory.get("successStep")
              .tasklet(successTasklet())
              .build();
  }
  @Bean
  public Step failStep(){
      return stepBuilderFactory.get("failStep")
              .tasklet(failTasklet())
              .build();
  }

  //如果firstStep 执行成功：下一步执行successStep 否则是failStep
  @Bean
  public  Job job(){
      return jobBuilderFactory.get("status-step-job")
              .start(firstStep())
              //表示将当前本应该是失败结束的步骤直接转成正常结束--COMPLETED
              //.on("FAILED").end()  
              //表示将当前本应该是失败结束的步骤直接转成失败结束：FAILED
              //.on("FAILED").fail()  
              //表示将当前本应该是失败结束的步骤直接转成停止结束：STOPPED   里面参数表示后续要重启时， 从successStep位置开始
              .on("FAILED").stopAndRestart(successStep())
              .from(firstStep()).on("*").to(successStep())
              .end()
              .incrementer(new RunIdIncrementer())
              .build();
  }

  public static void main(String[] args) {
      SpringApplication.run(StatusStepJob.class, args);
  }
}
