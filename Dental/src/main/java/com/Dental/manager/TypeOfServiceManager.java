package com.Dental.manager;

import java.util.ArrayList;

import com.Dental.entity.TypeOfService;

public interface TypeOfServiceManager {
	ArrayList<TypeOfService> getAllTypeOfService();
	
	TypeOfService get(int id);
	
	TypeOfService create( String name);
	
	TypeOfService update(int id, String name);
	
	void delete(int id);
}
