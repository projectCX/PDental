package com.Dental.dao;

import java.util.ArrayList;

import com.Dental.entity.Medicine;
import com.Dental.entity.Prescription;
import com.Dental.entity.TreatmentTicket;

public interface PrescriptionDAO {
	
	ArrayList<Prescription> getAll();
	
	Prescription get(int id);
	
	void delete(int id);
	
	Prescription create(int medicine, int treatmentTicket, String dosageDrugs, int quantity, String status);
	
	Prescription update(int id, Medicine medicine, TreatmentTicket treatmentTicket, String dosageDrugs, int quantity, String status);
}
