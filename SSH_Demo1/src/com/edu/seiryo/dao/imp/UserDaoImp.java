package com.edu.seiryo.dao.imp;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

public class UserDaoImp implements UserDao {
	private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}

}
