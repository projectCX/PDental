package com.Dental.dao.Impl;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.Dental.dao.TreatmentTicketDAO;
import com.Dental.entity.MedicalRecord;
import com.Dental.entity.TreatmentTicket;
import com.Dental.utils.HibernateUtil;

@Service
public class TreatmentTicketDAOImpl implements TreatmentTicketDAO {

	@Override
	public ArrayList<TreatmentTicket> getAll() {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<TreatmentTicket> list = new ArrayList<TreatmentTicket>();
		String sql = "from TreatmentTicket";
		Query query = session.createQuery(sql);
		list = (ArrayList<TreatmentTicket>) query.list();
		return list;
	}

	@Override
	public TreatmentTicket get(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TreatmentTicket sp = (TreatmentTicket) session.get(TreatmentTicket.class, id);
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
		TreatmentTicket sp = (TreatmentTicket) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public TreatmentTicket create(int medicalRecordID, Date created_date, String fileImg, String examResult,
			int active) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query = "INSERT INTO TREATMENT_TICKETS (CREATED_DATE, FILE_IMAGES, EXAMINATION_RESULTS, ACTIVE, MEDICAL_RECORD_ID) VALUES (?, ?, ?, ?, ?)";
		Query ps = session.createSQLQuery(query);
		ps.setParameter(0, created_date);
		ps.setParameter(1, fileImg);
		ps.setParameter(2, examResult);
		ps.setParameter(3, active);
		ps.setParameter(4, medicalRecordID);
		ps.executeUpdate();
		session.getTransaction().commit();
		session.close();

		return null;
	}

	@Override
	public TreatmentTicket update(int id, MedicalRecord medicalRecord, Date created_date, String fileImg,
			String examResult, int active) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		TreatmentTicket sp = get(id);

		sp.setActive(active);
		sp.setCreated_date(created_date);
		sp.setExamResult(examResult);
		sp.setMedicalRecord(medicalRecord);
		sp.setFileImg(fileImg);

		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

}
