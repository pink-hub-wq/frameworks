package com.edu.seiryo;

import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;
import org.springframework.lang.Nullable;

public class RunIdIncrementer implements JobParametersIncrementer {

	private static String RUN_ID_KEY = "run.id";

	private String key = RUN_ID_KEY;

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public JobParameters getNext(@Nullable JobParameters parameters) {

		JobParameters params = (parameters == null) ? new JobParameters() : parameters;
		JobParameter runIdParameter = params.getParameters().get(this.key);
		long id = 1;
		if (runIdParameter != null) {
			try {
				id = Long.parseLong(runIdParameter.getValue().toString()) + 1;
			}
			catch (NumberFormatException exception) {
				throw new IllegalArgumentException("Invalid value for parameter "
						+ this.key, exception);
			}
		}
		return new JobParametersBuilder(params).addLong(this.key, id).toJobParameters();
	}

}
