package com.edu.seiryo;

import javax.batch.runtime.StepExecution;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecutionListener;

public class MyStepListener implements StepExecutionListener {

	@Override
	public void beforeStep(org.springframework.batch.core.StepExecution stepExecution) {
		System.out.println("-----------beforeStep--------->");

	}

	@Override
	public ExitStatus afterStep(org.springframework.batch.core.StepExecution stepExecution) {
		System.out.println("-----------afterStep--------->");
		return stepExecution.getExitStatus();
	}
}
