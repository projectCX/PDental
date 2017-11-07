package com.Dental.dao;

import java.util.ArrayList;

import com.Dental.entity.Medicine;
import com.Dental.entity.TypeMedicine;

public interface MedicineDAO {
	
	ArrayList<Medicine> getAll();
	
	Medicine get(int id);
	
	void delete(int id);
	
	Medicine create(int  typeID, String name, String unit, float unitPrice);
	
	Medicine update (int id, TypeMedicine type, String name, String unit, float unitPrice);
}
