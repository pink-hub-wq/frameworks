package com.edu.seiryo;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StopStepListener implements StepExecutionListener{

	@Override
	public void beforeStep(StepExecution stepExecution) {
		
		
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		if(ResouceCount.totalCount != ResouceCount.readCount){
            return ExitStatus.STOPPED; 
        }
        return stepExecution.getExitStatus();
	}

}
