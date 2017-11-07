package com.Dental.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.Dental.dao.PrescriptionDAO;
import com.Dental.entity.Medicine;
import com.Dental.entity.Prescription;
import com.Dental.entity.Prescription;
import com.Dental.entity.TreatmentTicket;
import com.Dental.utils.HibernateUtil;

@Service
public class PrescriptionDAOImpl implements PrescriptionDAO{

	@Override
	public ArrayList<Prescription> getAll() {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<Prescription> list = new ArrayList<Prescription>();
		String sql = "from Prescription" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<Prescription>) query.list();
		return list;
	}

	@Override
	public Prescription get(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Prescription sp = (Prescription) session.get(Prescription.class, id);	
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
		Prescription sp = (Prescription) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public Prescription create(int medicine, int treatmentTicket, String dosageDrugs, int quantity, String status) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query ="INSERT INTO PRESCRIPTIONS (DOSAGE_OF_DRUGS, QUANTITY, STATUS, MEDICINE_ID,TREATMENT_TICKET_ID) VALUES (?, ?, ?, ?, ?)";
		Query ps = session.createSQLQuery(query);
		ps.setParameter(0,dosageDrugs );
		ps.setParameter(1,quantity );
		ps.setParameter(2, status);
		ps.setParameter(3, medicine);
		ps.setParameter(4, treatmentTicket);
		ps.executeUpdate();
		session.getTransaction().commit();
		session.close();
		return null;
	}

	@Override
	public Prescription update(int id, Medicine medicine, TreatmentTicket treatmentTicket, String dosageDrugs,
			int quantity, String status) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		Prescription sp = get(id);
		
		sp.setDosageDrugs(dosageDrugs);
		sp.setMedicine(medicine);
		sp.setQuantity(quantity);
		sp.setStatus(status);
		sp.setTreatmentTicket(treatmentTicket);
		
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

}
