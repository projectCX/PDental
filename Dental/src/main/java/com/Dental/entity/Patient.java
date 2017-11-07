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
@Table(name = PATIENTS)
public class Patient extends Entity{
	
	@OneToMany(mappedBy="patient")
	private Set<MedicalRecord> medicalRecord;
	
	@Column(name = NAME)
	private String name;
	
	@Column(name = ADDRESS)
	private String address ;
	
	@Column(name = PHONE)
	private String phone ;
	
	@Column(name = DOB )
	private Date dob ;
	
	@Column(name = SEX)
	private int sex ;
	
	
	public Patient() {
		super();
	}
	

	public Set<MedicalRecord> getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(Set<MedicalRecord> medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
}
