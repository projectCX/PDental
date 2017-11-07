package com.Dental.dao.Impl;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Dental.dao.ServiceDAO;
import com.Dental.dao.TypeOfServiceDAO;
import com.Dental.entity.Services;
import com.Dental.entity.TypeOfService;
import com.Dental.utils.HibernateUtil;




@Service
public class ServiceDAOImpl implements ServiceDAO{
	
	

	@Override
	public ArrayList<Services> getAll() {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		ArrayList<Services> list = new ArrayList<Services>();
		String sql = "from Services" ;
		Query query = session.createQuery(sql);
		list = (ArrayList<Services>) query.list();
		return list;
	}

	@Override
	public Services create(int typeID, String name, int unitPrice, String unit) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query ="INSERT INTO SERVICES(NAME, UNIT, UNIT_PRICE, TYPE_SERVICE_ID) VALUES (?, ?, ?, ?)";
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
	public Services update(int id, TypeOfService type, String name, int unitPrice, String unit) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		Services sp = get(id);
		
		sp.setName(name);
		sp.setTypeOfService(type);
		sp.setUnit(unit);
		sp.setUnitPrice(unitPrice);		
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
		Services sp = (Services) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public Services get(int id) {
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Services sp = (Services) session.get(Services.class, id);	
		transaction.commit();
		session.close();
		return sp;
	}
}
