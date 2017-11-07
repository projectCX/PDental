package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = PRESCRIPTIONS)
public class Prescription extends Entity {
	
	@ManyToOne
	@JoinColumn(name = MEDICINE_ID)
	private Medicine medicine;
	
	@ManyToOne
	@JoinColumn(name= TREATMENT_TICKET_ID)
	private TreatmentTicket treatmentTicket;
	
	@Column(name = DOSAGE_OF_DRUGS)
	private String dosageDrugs;
	
	@Column(name = QUANTITY)
	private int quantity;
	
	@Column(name = STATUS)
	private String status;

	public Prescription() {
		super();
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public TreatmentTicket getTreatmentTicket() {
		return treatmentTicket;
	}

	public void setTreatmentTicket(TreatmentTicket treatmentTicket) {
		this.treatmentTicket = treatmentTicket;
	}

	public String getDosageDrugs() {
		return dosageDrugs;
	}

	public void setDosageDrugs(String dosageDrugs) {
		this.dosageDrugs = dosageDrugs;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
