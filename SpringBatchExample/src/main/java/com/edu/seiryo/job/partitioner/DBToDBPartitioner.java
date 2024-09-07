package com.edu.seiryo.job.partitioner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import com.edu.seiryo.config.DBToDBJobConfig;

public class DBToDBPartitioner implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		Map<String, ExecutionContext> result = new HashMap<>(gridSize);

		int range = DBToDBJobConfig.RANGE;
		int start = 1;
		int end = DBToDBJobConfig.RANGE;

		for (int i = 0; i < gridSize; i++) {
			ExecutionContext context = new ExecutionContext();
			context.putInt("from", start);
			context.putInt("to", end);
			context.putInt("range", range);

			start += range;
			end += range;

			result.put("partition_" + i, context);
		}
		return result;
	}
}
