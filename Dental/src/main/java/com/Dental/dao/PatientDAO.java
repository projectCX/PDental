package com.Dental.dao;

import java.util.ArrayList;
import java.util.Date;



import com.Dental.entity.Patient;


public interface PatientDAO {
	
	ArrayList<Patient> getAll();
		
	Patient get(int id);
	
	void delete(int id);
	
	Patient create(String name, String address, Date dob, int sex, String phone);
	
	Patient update(int id, String name, String address, Date dob, int sex, String phone);
}
