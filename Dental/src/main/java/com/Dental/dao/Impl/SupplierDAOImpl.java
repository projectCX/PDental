package com.Dental.dao.Impl;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Dental.dao.SupplierDAO;
import com.Dental.entity.Supplier;
import com.Dental.utils.HibernateUtil;

@Service
public class SupplierDAOImpl implements SupplierDAO {

	@Override
	public ArrayList<Supplier> getAll() {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<Supplier> list = new ArrayList<Supplier>();
		String sql = "from Supplier";
		Query query = session.createQuery(sql);
		list = (ArrayList<Supplier>) query.list();
		System.out.println("QQQQQQQQQQQQQQ");
		session.close();
		return list;
	}

	@Override
	public Supplier create(String name, String address, String phone, String email, String status) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Supplier sp = new Supplier();
		sp.setName(name);
		sp.setAddress(address);
		sp.setPhone(phone);
		sp.setEmail(email);
		sp.setStatus(status);
		session.save(sp);
		transaction.commit();
		session.close();
		return sp;
	}

	@Override
	public Supplier update(int id, String name, String address, String phone, String email, String status) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		Supplier sp = get(id);
		sp.setAddress(address);
		sp.setEmail(email);
		sp.setName(name);
		sp.setPhone(phone);
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
		Supplier sp = (Supplier) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public Supplier get(int id) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Supplier sp = (Supplier) session.get(Supplier.class, id);
		transaction.commit();
		session.close();
		return sp;
	}
}
