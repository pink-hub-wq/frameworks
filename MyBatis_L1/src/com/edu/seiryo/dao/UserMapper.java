package com.edu.seiryo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.MyBatisUtil;

public class UserMapper {
	public void add(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		int i = sqlSession.insert("UserMapper.add");
		sqlSession.commit();
		System.out.println(i);
		sqlSession.close();
	}
	public void add2(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		int i = sqlSession.insert("UserMapper.add2",new User("Ð¡¾Å", "123"));
		sqlSession.commit();
		System.out.println(i);
		sqlSession.close();
	}
	public void delete(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		int i = sqlSession.insert("UserMapper.delete",8);
		sqlSession.commit();
		System.out.println(i);
		sqlSession.close();
	}
	public void update(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		int i = sqlSession.insert("UserMapper.update",new User(7,"Ð¡¾Å", "456"));
		sqlSession.commit();
		System.out.println(i);
		sqlSession.close();
	}
	public void queryById(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		User user = sqlSession.selectOne("UserMapper.queryById",7);
		sqlSession.commit();
		System.out.println(user);
		sqlSession.close();
	}
	public void query(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		List<User> list = sqlSession.selectList("UserMapper.query");
		sqlSession.commit();
		for (User user : list) {
			System.out.println(user);
		}
		sqlSession.close();
	}
	public static void main(String[] args) {
		UserMapper userMapper = new UserMapper();
		userMapper.query();
	}
}
