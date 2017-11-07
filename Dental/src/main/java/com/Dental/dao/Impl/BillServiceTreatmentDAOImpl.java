package com.Dental.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Dental.dao.BillServiceTreatmentDAO;
import com.Dental.entity.BillServiceTreatment;
import com.Dental.entity.Services;
import com.Dental.entity.TreatmentTicket;
import com.Dental.utils.HibernateUtil;

@Service
public class BillServiceTreatmentDAOImpl implements BillServiceTreatmentDAO{

	
	@Override
	public ArrayList<BillServiceTreatment> getAll() {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<BillServiceTreatment> list = new ArrayList<BillServiceTreatment>();
		String sql = "from BillServiceTreatment" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<BillServiceTreatment>) query.list();
		return list;
	}

	@Override
	public BillServiceTreatment get(int id) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		BillServiceTreatment sp = (BillServiceTreatment) session.get(BillServiceTreatment.class, id);	
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
		BillServiceTreatment sp = (BillServiceTreatment) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public BillServiceTreatment create(int ticketID, int serviceID, int quantity, float discount, float total) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query ="INSERT INTO BILL_SERVICE_TREATMENTS(QUANTITY, DISCOUNT, TOTAL, SERVICE_ID, TREATMENT_TICKET_ID) VALUES (?, ?, ?, ?, ?)";
		Query ps = session.createSQLQuery(query);
		
		ps.setParameter(0, quantity);
		ps.setParameter(1, discount);
		ps.setParameter(2, total);
		ps.setParameter(3, serviceID);
		ps.setParameter(4, ticketID);	
		ps.executeUpdate();
		session.getTransaction().commit();
		session.close();
		return null;
	}

	@Override
	public BillServiceTreatment update(int id, TreatmentTicket ticket, Services service, int quantity, float discount,
			float total) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		BillServiceTreatment sp = get(id);
		
		sp.setDiscount(discount);
		sp.setQuantity(quantity);
		sp.setService(service);
		sp.setTreatmentTicket(ticket);
		sp.setTotal(total);
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

}
