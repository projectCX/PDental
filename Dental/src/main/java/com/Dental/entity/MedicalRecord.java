package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = MEDICAL_RECORDS)
public class MedicalRecord extends Entity{
	
	@ManyToOne
	@JoinColumn(name = PATIENT_ID)
	private Patient patient;
	
	
	@ManyToOne
	@JoinColumn(name = PERSON_ID)
	private Person person ;
	
	@OneToMany(mappedBy ="medicalRecord")
	private Set<TreatmentTicket> treatmentTicket;
	
	@Column(name = CREATED_DATE)
	private Date createdDate ;
	
	@Column(name = FORETOKEN)
	private String foreToken ;
	
	@Column(name = DIAGNOSE)
	private String diagnose ;
	
	@Column(name = STATUS )
	private String status ;

	public MedicalRecord() {
		super();
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<TreatmentTicket> getTreatmentTicket() {
		return treatmentTicket;
	}

	public void setTreatmentTicket(Set<TreatmentTicket> treatmentTicket) {
		this.treatmentTicket = treatmentTicket;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getForeToken() {
		return foreToken;
	}

	public void setForeToken(String foreToken) {
		this.foreToken = foreToken;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
