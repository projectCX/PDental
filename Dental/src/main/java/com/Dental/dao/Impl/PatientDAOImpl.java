package com.Dental.dao.Impl;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.Dental.dao.PatientDAO;
import com.Dental.entity.Patient;
import com.Dental.entity.Services;
import com.Dental.entity.Patient;
import com.Dental.utils.HibernateUtil;
@Service
public class PatientDAOImpl implements PatientDAO{

	@Override
	public ArrayList<Patient> getAll() {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<Patient> list = new ArrayList<Patient>();
		String sql = "from Patient" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<Patient>) query.list();
		return list;
	}

	@Override
	public Patient get(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Patient sp = (Patient) session.get(Patient.class, id);	
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
		Patient sp = (Patient) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public Patient create(String name, String address, Date dob, int sex, String phone) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query ="INSERT INTO PATIENTS (NAME, ADDRESS, PHONE, DOB, SEX) VALUES (?, ?, ?, ?, ?)";
		Query ps = session.createSQLQuery(query);
		
		ps.setParameter(0, name);
		ps.setParameter(1, address);
		ps.setParameter(2, phone);
		ps.setParameter(3, dob);	
		ps.setParameter(4, sex);
		ps.executeUpdate();
		session.getTransaction().commit();
		session.close();

		return null;
	}

	@Override
	public Patient update(int id, String name, String address, Date dob, int sex, String phone) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		Patient sp = get(id);
		sp.setAddress(address);	
		sp.setDob(dob);
		sp.setName(name);
		sp.setPhone(phone);
		sp.setSex(sex);
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

}
