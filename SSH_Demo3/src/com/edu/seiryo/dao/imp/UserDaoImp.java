package com.edu.seiryo.dao.imp;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

public class UserDaoImp extends HibernateDaoSupport implements UserDao {
	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

}
