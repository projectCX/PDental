package com.Dental.dao;

import java.util.ArrayList;

import com.Dental.entity.BillServiceTreatment;
import com.Dental.entity.Services;
import com.Dental.entity.TreatmentTicket;

public interface BillServiceTreatmentDAO {
	
	ArrayList<BillServiceTreatment> getAll();
	
	BillServiceTreatment get(int id);
	
	void delete(int id);
	
	BillServiceTreatment create(int ticketID, int serviceID, int quantity, float discount, float total);	
	
	BillServiceTreatment update(int id, TreatmentTicket ticket, Services service, int quantity, float discount, float total);
}
