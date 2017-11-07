package com.Dental.manager;

import java.util.ArrayList;

import com.Dental.entity.Supplier;

public interface SupplierManager {
	ArrayList<Supplier> getAllSupplier();
	
	Supplier get(int id);
	
	Supplier create(String name, String address, String phone, String email, String status);
	
	Supplier update( int id,String name, String address, String phone, String email, String status );
	
	void delete(int id);
}
