package com.edu.seiryo.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.mapper.UserMapper;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.util.MyBatisUtil;

public class UserServiceImp implements UserService{
	UserMapper userMapper = null;
	@Override
	public int add(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		int i = userMapper.add(user);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}

	@Override
	public int update(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		int i = userMapper.update(user);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}

	@Override
	public int delete(int[] ids) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		int i = userMapper.delete(ids);
		sqlSession.commit();
		sqlSession.close();
		return i;
	}

	@Override
	public List<User> query(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.query(user);
		return list;
	}

	@Override
	public List<User> queryById(int[] ids) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.queryById(ids);
		return list;
	}

}
