//package com.Dental.manager.Impl;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Dental.dao.ServiceDAO;
//import com.Dental.entity.Services;
//import com.Dental.entity.TypeOfService;
//import com.Dental.manager.ServiceManager;
//
//@Service
//public class ServiceManagerImpl implements ServiceManager{
//	@Autowired
//	private ServiceDAO dao;
//
//	@Override
//	public ArrayList<Services> getAll() {
//		// TODO Auto-generated method stub
//		return dao.getAll();
//	}
//
//	@Override
//	public Services get(int id) {
//		// TODO Auto-generated method stub
//		return dao.get(id);
//	}
//
//	@Override
//	public Services create(int typeID, String name, int unitPrice, String unit) {
//		// TODO Auto-generated method stub
//		return dao.create(typeID, name, unitPrice, unit);
//	}
//
//	
//	@Override
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		dao.delete(id);
//	}
//
//	@Override
//	public Services update(int id, TypeOfService type, String name, int unitPrice, String unit) {
//		// TODO Auto-generated method stub
//		return dao.update(id, type, name, unitPrice, unit);
//	}
//
//	
//
//}
