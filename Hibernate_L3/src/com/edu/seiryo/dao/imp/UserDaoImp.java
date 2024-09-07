package com.edu.seiryo.dao.imp;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.HibernateUtil;

public class UserDaoImp {
	public void add(){
		Session session = null; 
	    Transaction transaction = null;
	    User user = new User("����", "123");
	    try {
	    	session = HibernateUtil.getCurrentSession();
	        transaction = session.beginTransaction();
	        session.save(user);
	        transaction.commit();
	    } catch (Exception e) {
	        transaction.rollback();
	        e.printStackTrace();
	    }
	}
	//OID��ѯ
	public void hibernateOID(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = session.get(User.class, 1);
		System.out.println(user);
	}
	//HQL��ѯ(��ѯ����)
	public void hibernateQuery(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//HQL��ѯ(������ѯ)
	public void hibernateQuery2(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User where name = ? and pwd = ?");
		query.setParameter(0, "����");
		query.setParameter(1, "123");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//HQL��ѯ(�����ѯ)
	public void hibernateQuery3(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User order by id desc");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//HQL��ѯ(��ҳ��ѯ)
	public void hibernateQuery4(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User order by id desc");
		query.setFirstResult(2);
		query.setMaxResults(2);
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//HQL��ѯ(ͶӰ��ѯ(�����ֶβ�ѯ))
	public void hibernateQuery5(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("select name from User");
		List<String> list = query.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
	//HQL��ѯ(�ۺϺ���)
	public void hibernateQuery6(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("select count(name) from User");
		List<Long> list = query.list();
		for (Long long1 : list) {
			System.out.println(long1);
		}
	}
	//QBC��ѯ(��ѯ����)
	public void hibernateCriteria(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> list = criteria.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//QBC��ѯ(������ѯ)
	public void hibernateCriteria2(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("name", "����"));
		List<User> list = criteria.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//QBC��ѯ(�����ѯ)
	public void hibernateCriteria3(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.addOrder(Order.desc("id"));
		List<User> list = criteria.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//QBC��ѯ(��ҳ��ѯ)
	public void hibernateCriteria4(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.setFirstResult(2);
		criteria.setMaxResults(2);
		List<User> list = criteria.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//QBC��ѯ(�ۺϺ���)
	public void hibernateCriteria5(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.setProjection(Projections.rowCount());
		List<Long> list = criteria.list();
		for (Long long1 : list) {
			System.out.println(long1);
		}
	}
	//QBC��ѯ(ͶӰ��ѯ)
	public void hibernateCriteria6(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.setProjection(Projections.property("name"));
		List<String> list = criteria.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
	//SQLQuery��ѯ(��ѯ����)
	public void hibernateSQLQuery(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select * from t_user");
		sqlQuery.addEntity(User.class);
		List<User> list = sqlQuery.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//SQLQuery��ѯ(������ѯ)
	public void hibernateSQLQuery2(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select * from t_user where name = ? and pwd = ?");

		sqlQuery.addEntity(User.class);
		sqlQuery.setParameter(0, "����");
		sqlQuery.setParameter(1, 123);
		List<User> list = sqlQuery.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//SQLQuery��ѯ(�����ѯ)
	public void hibernateSQLQuery3(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select * from t_user order by id desc");
		sqlQuery.addEntity(User.class);
		List<User> list = sqlQuery.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//SQLQuery��ѯ(��ҳ��ѯ)
	public void hibernateSQLQuery4(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select * from t_user");
		sqlQuery.addEntity(User.class);
		sqlQuery.setFirstResult(2);
		sqlQuery.setMaxResults(2);
		List<User> list = sqlQuery.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//SQLQuery��ѯ(�ۺϺ���)
	public void hibernateSQLQuery5(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select count(*) from t_user");
		List<Object> list = sqlQuery.list();
		for (Object object : list) {
			System.out.println(object);
		}
	}
	//SQLQuery��ѯ(ͶӰ��ѯ)
	public void hibernateSQLQuery6(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select name from t_user");
		List<Object> list = sqlQuery.list();
		for (Object object : list) {
			System.out.println(object);
		}
	}
	public static void main(String[] args) {
		UserDaoImp userDaoImp = new UserDaoImp();
//		userDaoImp.hibernateOID();
//		userDaoImp.hibernateQuery();
		userDaoImp.hibernateCriteria6();
//		userDaoImp.hibernateSQLQuery6();
	}
}
