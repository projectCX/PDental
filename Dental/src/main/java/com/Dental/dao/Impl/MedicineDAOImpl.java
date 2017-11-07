package com.Dental.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.Dental.dao.MedicineDAO;
import com.Dental.entity.Medicine;
import com.Dental.entity.TypeMedicine;
import com.Dental.utils.HibernateUtil;

@Service
public class MedicineDAOImpl implements MedicineDAO{

	@Override
	public ArrayList<Medicine> getAll() {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<Medicine> list = new ArrayList<Medicine>();
		String sql = "from Medicine" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<Medicine>) query.list();
		return list;
	}

	@Override
	public Medicine get(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Medicine sp = (Medicine) session.get(Medicine.class, id);	
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
		Medicine sp = (Medicine) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public Medicine create(int typeID, String name, String unit, float unitPrice) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query ="INSERT INTO MEDICINES (NAME, UNIT, UNIT_PRICE, TYPE_MEDICINE_ID) VALUES (?, ?, ?, ?)";
		Query ps = session.createSQLQuery(query);
		ps.setParameter(0, name);
		ps.setParameter(1, unit);
		ps.setParameter(2, unitPrice);
		ps.setParameter(3, typeID);	
		
		ps.executeUpdate();
		session.getTransaction().commit();
		session.close();

		return null;
	}

	@Override
	public Medicine update(int id, TypeMedicine type, String name, String unit, float unitPrice) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		Medicine sp = get(id);
		
		sp.setName(name);
		sp.setTypeMedicine(type);
		sp.setUnit(unit);
		sp.setUnitPrice(unitPrice);		
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}	
	
}
