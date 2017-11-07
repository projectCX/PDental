package com.Dental.dao;



import java.util.ArrayList;

import com.Dental.entity.Supplier;

public interface SupplierDAO {
	ArrayList<Supplier> getAll();
	
	Supplier get(int id);
	
	Supplier create(String name, String address, String phone, String email, String status);
	
	Supplier update( int id,String name, String address, String phone, String email, String status );
	
	void delete(int id);
	
	
}
