package com.Dental.dao;



import java.util.ArrayList;

import com.Dental.entity.Services;
import com.Dental.entity.TypeOfService;

public interface ServiceDAO {
	
	ArrayList<Services> getAll();
	
	Services get(int id);
	
	void delete(int id);
	
	Services create(int typeID, String name, int unitPrice, String unit);
	
	Services update(int id, TypeOfService type, String name, int unitPrice, String unit);
	
	
	
	
}
