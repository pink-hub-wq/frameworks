package com.edu.seiryo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.LogDao;
import com.edu.seiryo.entity.Log;
import com.edu.seiryo.service.LogService;
@Service
public class LogServiceImp implements LogService {
	@Autowired
	LogDao logDao;

	public LogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public void add(Log log) {
		logDao.add(log);
	}
	
}
