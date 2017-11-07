package com.Dental.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.Dental.dao.TypeMedicineDAO;
import com.Dental.entity.TypeMedicine;

import com.Dental.utils.HibernateUtil;

@Service
public class TypeMedicineDAOImpl implements TypeMedicineDAO{

	@Override
	public ArrayList<TypeMedicine> getAll() {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<TypeMedicine> list = new ArrayList<TypeMedicine>();
		String sql = "from TypeMedicine" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<TypeMedicine>) query.list();
		return list;
	}

	@Override
	public TypeMedicine get(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TypeMedicine sp = (TypeMedicine) session.get(TypeMedicine.class, id);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public TypeMedicine create(String name, String status) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TypeMedicine sp = new TypeMedicine();
		sp.setName(name);
		session.save(sp);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public TypeMedicine update(int id, String name, String status) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		TypeMedicine sp = get(id);
		sp.setName(name);
		sp.setStatus(status);
		
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		TypeMedicine sp = (TypeMedicine) get(id);
		session.delete(sp);
		transaction.commit();
	}

}
