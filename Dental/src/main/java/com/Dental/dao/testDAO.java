package com.Dental.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.Dental.entity.party1;
import com.Dental.entity.people;
import com.Dental.utils.HibernateUtil;



@Repository
public class testDAO {
	public ArrayList<people> getAllChild(){
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
//		Transaction transaction = null;
		Transaction transaction = session.beginTransaction();	
		ArrayList<people> list = new ArrayList<people>();
		String sql = " from people " ;
		Query query = session.createQuery(sql);
		list = (ArrayList<people>) query.list();
		
		//ArrayList<Person> list = (ArrayList<Person>) session.createQuery("from Person").list();
		return list;	
	}
	
	public ArrayList<Integer> getListParentID(int childID){
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
//		Transaction transaction = null;
		Transaction transaction = session.beginTransaction();
		ArrayList<Integer> list = new ArrayList<Integer>();
		String sql = "from party where child_id = :childID";
		Query query = session.createQuery(sql);
		query.setParameter("childID", childID);
		list = (ArrayList<Integer>) query.list();
		System.out.println(list);
		return list;
	}
	
//	public ArrayList<Integer> getListChildrenID(int parentID){
//		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
////		Transaction transaction = null;
//		Transaction transaction = session.beginTransaction();
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		String sql = "from party where parent_id = "+parentID;
//		Query query = session.createQuery(sql);
//		list = (ArrayList<Integer>) query.list();
//		return list;
//	}
	
//	public ArrayList<people> getListChildrenID(int parentID){
//		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
////		Transaction transaction = null;
//		Transaction transaction = session.beginTransaction();
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		String sql = "from party where parent_id = "+parentID;
//		Query query = session.createQuery(sql);
//		list = (ArrayList<Integer>) query.list();
//		return list;
//	}
//	
	
	public ArrayList<party1> getListParty(){
//		System.out.println("abc1");
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
//		System.out.println("abc2");
//		Transaction transaction = null;
		Transaction transaction = session.beginTransaction();	
//		System.out.println("abc21");
		ArrayList<party1> list = new ArrayList<party1>();
//		System.out.println("abc211");
		String sql = "from party1" ;
//		System.out.println("abc21111");
		Query query = session.createQuery(sql);
//		System.out.println("abc22221");
		list = (ArrayList<party1>) query.list();
		System.out.println("abc");
		//ArrayList<Person> list = (ArrayList<Person>) session.createQuery("from Person").list();
		return list;
	}
	
//	public ArrayList<PropertyEntry> getAllProperty(){
//		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
////		Transaction transaction = null;
//		Transaction transaction = session.beginTransaction();	
//		ArrayList<PropertyEntry> list = new ArrayList<PropertyEntry>();
//		String sql = " from PropertyEntry " ;
//		Query query = session.createQuery(sql);
//		list = (ArrayList<PropertyEntry>) query.list();
//		
//		//ArrayList<Person> list = (ArrayList<Person>) session.createQuery("from Person").list();
//		return list;	
//	}
}
