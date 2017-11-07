package com.Dental.dao;

import java.util.ArrayList;

import com.Dental.entity.TypeMedicine;

public interface TypeMedicineDAO {
	ArrayList<TypeMedicine> getAll();
	
	TypeMedicine get(int id);
	
	TypeMedicine create( String name, String status);
	
	TypeMedicine update(int id, String name, String status);
	
	void delete(int id);
}
