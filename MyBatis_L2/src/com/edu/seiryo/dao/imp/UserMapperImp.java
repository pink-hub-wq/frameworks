package com.edu.seiryo.dao.imp;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.edu.seiryo.dao.UserMapper;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.MyBatisUtil;

public class UserMapperImp implements UserMapper {
	@Override
	public int add(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int i = userMapper.add(user);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}
	@Override
	public List<User> query(String order) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.query(order);
		return list;
	}
	@Override
	public User queryById(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.queryById(id);
		return user;
	}
	@Override
	public int update(String name, String pwd) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int i = userMapper.update(name,pwd);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}
	@Override
	public int delete(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int i = userMapper.delete(id);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}
}
