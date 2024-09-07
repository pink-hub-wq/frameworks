package com.edu.seiryo.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.BaseDaoImp;
import com.sun.org.apache.bcel.internal.generic.NEW;
@Repository
public class UserDaoImp extends BaseDaoImp<User>implements UserDao {

	@Override
	public User login(User user) {
		List<User> list = this.getHibernateTemplate().find("from User where name = ? and pwd = ?",new String[] {user.getName(),user.getPwd()});
		return list.size() > 0 ? list.get(0) : null;
	}
}
