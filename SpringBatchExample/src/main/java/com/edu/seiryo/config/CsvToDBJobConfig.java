package com.edu.seiryo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import com.edu.seiryo.entity.Employee;
import com.edu.seiryo.listener.CsvToDBJobListener;

import java.io.File;

/**
 * 将数据从csv文件中读取，并写入数据库
 */
@Configuration
public class CsvToDBJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Value("${job.data.path}")
    private String path;
    
    @Bean
    public FlatFileItemReader<Employee> csvToDBItemReader(){
    	return new FlatFileItemReaderBuilder<Employee>()
                .name("employeeCSVItemReader")
                .saveState(false)
                .resource(new PathResource(new File(path, "employee.csv").getAbsolutePath()))
                .delimited()
                .names("id", "name", "age", "sex")
                .targetType(Employee.class)
                .build();
    }
    @Bean
    public MyBatisBatchItemWriter<Employee> csvToDBItemWriter(){
        MyBatisBatchItemWriter<Employee> itemWriter = new MyBatisBatchItemWriter<>();
        itemWriter.setSqlSessionFactory(sqlSessionFactory);
        itemWriter.setStatementId("com.edu.seiryo.mapper.EmployeeMapper.saveTemp");
        return itemWriter;
    }

    @Bean
    public Step csvToDBStep(){
        return stepBuilderFactory.get("csvToDBStep")
                .<Employee, Employee>chunk(10000)
                .reader(csvToDBItemReader())
                .writer(csvToDBItemWriter())
                .taskExecutor(new SimpleAsyncTaskExecutor())
                .build();
    }
    @Bean
    public CsvToDBJobListener csvToDBJobListener(){
        return new CsvToDBJobListener();
    }

    @Bean
    public Job csvToDBJob(){
        return jobBuilderFactory.get("csvToDB-step-job")
                .start(csvToDBStep())
                .incrementer(new RunIdIncrementer())
                .listener(csvToDBJobListener())
                .build();
    }
}