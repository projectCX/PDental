package com.Dental.dao;

import java.util.ArrayList;

import com.Dental.entity.TypeOfService;



public interface TypeOfServiceDAO {
	
	ArrayList<TypeOfService> getAll();
	
	TypeOfService get(int id);
	
	TypeOfService create( String name);
	
	TypeOfService update(int id, String name);
	
	void delete(int id);
}
