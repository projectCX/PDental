package com.Dental.dao;

import java.util.ArrayList;
import java.util.Date;

import com.Dental.entity.MedicalRecord;
import com.Dental.entity.TreatmentTicket;

public interface TreatmentTicketDAO {
	
	ArrayList<TreatmentTicket> getAll();
	
	TreatmentTicket get(int id);
	
	void delete(int id);
	
	TreatmentTicket create(int medicalRecordID, Date created_date, String fileImg, String examResult, int active);
	
	TreatmentTicket update(int id, MedicalRecord medicalRecord, Date created_date, String fileImg, String examResult, int active);
}
