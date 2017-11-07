package com.Dental.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.Dental.dao.AbstractDAO;
import com.Dental.dao.PersonDAO;
import com.Dental.entity.Patient;
import com.Dental.entity.Person;
import com.Dental.entity.Person;
import com.Dental.utils.HibernateUtil;

@Service
public class PersonDAOImpl implements PersonDAO {

	@Override
	public ArrayList<Person> getAll() {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<Person> list = new ArrayList<Person>();
		String sql = "from Person";
		Query query = session.createQuery(sql);
		list = (ArrayList<Person>) query.list();
		return list;
	}

	@Override
	public Person get(int id) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Person sp = (Person) session.get(Person.class, id);
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
		Person sp = (Person) get(id);
		session.delete(sp);
		transaction.commit();
	}

	@Override
	public Person create(String name, String address, String email, String dob, String position, String username,
			String password, String avatar, String phone, int sex) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String query = "INSERT INTO PERSON (NAME, ADDRESS, EMAIL, DOB, POSITIONS, USERNAME, PASSWORD, AVATAR, PHONE, SEX) VALUES (?, ?, ?, ?, ?,?, ?, ?, ?, ?)";
		Query ps = session.createSQLQuery(query);

		ps.setParameter(0, name);
		ps.setParameter(1, address);
		ps.setParameter(2, email);
		ps.setParameter(3, dob);
		ps.setParameter(4, position);
		ps.setParameter(5, username);
		ps.setParameter(6, password);
		ps.setParameter(7, avatar);
		ps.setParameter(8, phone);
		ps.setParameter(9, sex);
		ps.executeUpdate();
		session.getTransaction().commit();
		session.close();

		return null;
	}

	@Override
	public Person update(int id, String name, String address, String email, String dob, String position,
			String username, String password, String avatar, String phone, int sex) {
		// TODO Auto-generated method stub
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		Person sp = get(id);
		
		sp.setAddress(address);
		sp.setAvatar(avatar);
		sp.setDob(dob);
		sp.setEmail(email);
		sp.setPassword(password);
		sp.setPhone(phone);
		sp.setPosition(position);
		sp.setSex(sex);
		sp.setUsername(username);
		sp.setName(name);
		
		session.update(sp);
		transaction.commit();
		session.close();
		return sp;
	}

}
