package com.Dental.manager;

import java.util.ArrayList;

import com.Dental.entity.Services;
import com.Dental.entity.TypeOfService;

public interface ServiceManager {
	ArrayList<Services> getAll();
	
	Services get(int id);
	
	Services create(int typeID, String name, int unitPrice, String unit);
	
	Services update(int id, TypeOfService type, String name, int unitPrice, String unit);
	
	void delete(int id);
}
