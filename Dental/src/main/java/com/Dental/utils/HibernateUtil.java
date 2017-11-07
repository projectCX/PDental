package com.Dental.utils;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFac;
	
	static{
		try{
			sessionFac = new Configuration().configure().buildSessionFactory();
			
		}catch(Throwable  e){
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFac;
	}
}
