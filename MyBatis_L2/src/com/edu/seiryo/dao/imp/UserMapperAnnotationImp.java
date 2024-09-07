package com.edu.seiryo.dao.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.edu.seiryo.dao.UserMapperAnnotation;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.MyBatisUtil;

public class UserMapperAnnotationImp implements UserMapperAnnotation{

	@Override
	public int add(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapperAnnotation userMapperAnnotation = sqlSession.getMapper(UserMapperAnnotation.class);
		int i = userMapperAnnotation.add(user);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}

	@Override
	public List<User> query(String order) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapperAnnotation userMapperAnnotation = sqlSession.getMapper(UserMapperAnnotation.class);
		List<User> list = userMapperAnnotation.query(order);
		return list;
	}

	@Override
	public User queryById(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapperAnnotation userMapperAnnotation = sqlSession.getMapper(UserMapperAnnotation.class);
		User user = userMapperAnnotation.queryById(id);
		return user;
	}

	@Override
	public int update(String name, String pwd) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapperAnnotation userMapperAnnotation = sqlSession.getMapper(UserMapperAnnotation.class);
		int i = userMapperAnnotation.update(name, pwd);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}

	@Override
	public int delete(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapperAnnotation userMapperAnnotation = sqlSession.getMapper(UserMapperAnnotation.class);
		int i = userMapperAnnotation.delete(id);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}
	
}
