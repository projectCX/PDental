//package com.Dental.manager.Impl;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Dental.dao.SupplierDAO;
//import com.Dental.entity.Supplier;
//import com.Dental.manager.SupplierManager;
//
//@Service
//public class SupplierManagerImpl implements SupplierManager{
//	@Autowired
//	private SupplierDAO dao;
//	
//	@Override
//	public ArrayList<Supplier> getAllSupplier() {
//		// TODO Auto-generated method stub
//		return this.dao.getAll();
//	}
//
//	@Override
//	public Supplier get(int id) {
//		// TODO Auto-generated method stub
//		return dao.get(id);
//	}
//
//	@Override
//	public Supplier create(String name, String address, String phone, String email, String status) {
//		// TODO Auto-generated method stub
//		return dao.create(name, address, phone, email, status);
//	}
//
//	@Override
//	public Supplier update(int id, String name, String address, String phone, String email, String status) {
//		// TODO Auto-generated method stub
//		return dao.update(id, name, address, phone, email, status);
//	}
//
//	@Override
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		dao.delete(id);
//	}
//
//}
