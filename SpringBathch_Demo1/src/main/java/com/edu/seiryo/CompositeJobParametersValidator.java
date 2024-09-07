package com.edu.seiryo;

import java.util.List;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

public class CompositeJobParametersValidator implements JobParametersValidator, InitializingBean{

	private List<JobParametersValidator> validators;
	
	@Override
	public void validate(@Nullable JobParameters parameters) throws JobParametersInvalidException {
		for (JobParametersValidator validator : validators) {
			validator.validate(parameters);
		}
	}
	
	public void setValidators(List<JobParametersValidator> validators) {
		this.validators = validators;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(validators, "The 'validators' may not be null");
		Assert.notEmpty(validators, "The 'validators' may not be empty");
	}

}
