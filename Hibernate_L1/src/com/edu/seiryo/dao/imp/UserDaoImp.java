package com.edu.seiryo.dao.imp;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.edu.seiryo.entity.User;

public class UserDaoImp {
	public void add(){
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = new User("张三", "123");
		session.save(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	public void delete(){
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = new User();
		user.setId(1);
		session.delete(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	public void update(){
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = new User(2,"李四","123");
		session.update(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	public void queryById(){
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		User user = session.get(User.class, 2);
		System.out.println(user);
		session.close();
		sessionFactory.close();
	}
	public void query(){
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
		session.close();
		sessionFactory.close();
	}
	public static void main(String[] args) {
		UserDaoImp userDaoImp = new UserDaoImp();
		userDaoImp.add();
//		userDaoImp.delete();
//		userDaoImp.update();
//		userDaoImp.queryById();
		//userDaoImp.query();
	}
}
