package com.Dental.controller.suppliers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dental.dao.SupplierDAO;
import com.Dental.entity.Supplier;
import com.Dental.manager.SupplierManager;

@Component
public class SupplierAction {
	@Autowired
	SupplierDAO dao;
//	@Autowired
//	SupplierManager manager;
	
	private List<Supplier> listSuppliers;
	private int id;
	

	
	
	public SupplierAction(SupplierDAO dao) {
		super();
		this.dao = dao;
	}

	public void doDefault() {
		System.out.println("TTTTTTTTTTTTTTTTTTTtt");
		listSuppliers = dao.getAll();
		//listSuppliers = manager.getAllSupplier();
		System.out.println("++++++++++++++++++++"+listSuppliers.size());
	}
	
	public void doDelete() {
		dao.delete(id);
		listSuppliers = dao.getAll();
	}
//	public SupplierAction(SupplierManager manager) {
//		super();
//		this.manager = manager;
//	}
//
//	public SupplierManager getManager() {
//		return manager;
//	}

//	public void setManager(SupplierManager manager) {
//		this.manager = manager;
//	}

	public List<Supplier> getListSuppliers() {
		return listSuppliers;
	}

	public void setListSuppliers(List<Supplier> listSuppliers) {
		this.listSuppliers = listSuppliers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
