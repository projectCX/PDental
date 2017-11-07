package com.Dental.dao;

import java.util.ArrayList;

import com.Dental.entity.Person;

public interface PersonDAO {
	
	ArrayList<Person> getAll();
	
	Person get(int id);
	
	Person create(String name, String address, String email, String dob, String position, String username, String password, String avatar, String phone, int sex);
	
	Person update( int id, String name, String address, String email, String dob, String position, String username, String password, String avatar, String phone, int sex );
	
	void delete(int id);
}
