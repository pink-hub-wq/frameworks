package com.edu.seiryo.dao.imp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.HibernateUtil;

public class UserDaoImp {
	public void add(){
		Session session = null; 
	    Transaction transaction = null;
	    //游离态
	    User user = new User("王五", "123");
	    try {
	    	session = HibernateUtil.getCurrentSession();
	        transaction = session.beginTransaction();
	        session.save(user);
	        //持久态
	        transaction.commit();
	    } catch (Exception e) {
	        transaction.rollback();
	        e.printStackTrace();
	    } //finally {
	        //session.close();
	        //脱管态
	    //}
	}
	public void add2(){
		Session session = null; 
	    Transaction transaction = null;
	    try {
	    	session = HibernateUtil.getCurrentSession();
	        transaction = session.beginTransaction();
	        User user = session.get(User.class, 6);
//	        user.setPwd("789");
	        session.saveOrUpdate(user);
	        //持久态
	        transaction.commit();
	    } catch (Exception e) {
	        transaction.rollback();
	        e.printStackTrace();
	    }
	}
	public static void main(String[] args) {
		UserDaoImp userDaoImp = new UserDaoImp();
		userDaoImp.add2();
	}
}
