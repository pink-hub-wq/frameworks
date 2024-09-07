package com.edu.seiryo.util;

import java.io.Serializable;
import java.util.List;

import com.edu.seiryo.entity.User;

public interface BaseDao<T> {
	void add(T t);
	void delete(T t);
	void update(T t);
	List<T> query();
	T queryById(Serializable id);
}
