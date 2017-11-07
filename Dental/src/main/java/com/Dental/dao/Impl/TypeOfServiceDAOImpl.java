package com.Dental.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.springframework.stereotype.Service;

import com.Dental.dao.TypeOfServiceDAO;
import com.Dental.entity.Supplier;
import com.Dental.entity.TypeOfService;
import com.Dental.utils.HibernateUtil;

@Service
public class TypeOfServiceDAOImpl implements TypeOfServiceDAO{

	@Override
	public ArrayList<TypeOfService> getAll() {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<TypeOfService> list = new ArrayList<TypeOfService>();
		String sql = "from TypeOfService" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<TypeOfService>) query.list();
		return list;
	}

	@Override
	public TypeOfService get(int id) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TypeOfService sp = (TypeOfService) session.get(TypeOfService.class, id);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public TypeOfService create(String name) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TypeOfService sp = new TypeOfService();
		sp.setName(name);
		session.save(sp);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public TypeOfService update(int id, String name) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		TypeOfService sp = get(id);
		sp.setName(name);	
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public void delete(int id) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		TypeOfService sp = (TypeOfService) get(id);
		session.delete(sp);
		transaction.commit();
	}



}
