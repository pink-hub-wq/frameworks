package com.edu.seiryo.util;

import java.io.Serializable;
import java.util.List;


public interface BaseDao<T> {
	void add(T t);
	void delete(T t);
	void update(T t);
	List<T> query();
	T queryById(Serializable id);
}
