package com.edu.seiryo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static{
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public static Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
}
