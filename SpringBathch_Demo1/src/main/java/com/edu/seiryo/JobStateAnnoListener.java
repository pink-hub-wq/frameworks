package com.edu.seiryo;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

public class JobStateAnnoListener {
	@BeforeJob
	public void beforeJob(JobExecution jobExecution) {
		System.err.println("执行前-anno-status：" + jobExecution.getStatus());
	}

	@AfterJob
	public void afterJob(JobExecution jobExecution) {
		System.err.println("执行后-anno-status：" + jobExecution.getStatus());
	}
}
