package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.BaseDaoImp;
@Repository
public class UserDaoImp extends BaseDaoImp<UserInfo>implements UserDao {
	/**
	 * µÇÂ¼
	 */
	@Override
	public UserInfo login(UserInfo userInfo) {
		List<UserInfo> list = this.getHibernateTemplate().find(" from UserInfo where userName = ? and usePassword = ?",new String[] {userInfo.getUserName(),userInfo.getUsePassword()});
		return list.size() > 0 ? list.get(0) : null;
	}
}
