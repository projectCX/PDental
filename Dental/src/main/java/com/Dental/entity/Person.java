package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = PERSON)
public class Person extends Entity{
	

	@OneToMany(mappedBy="person")
	private Set<MedicalRecord> medicalRecord;
	
	@OneToMany(mappedBy="person")
	private Set<WorkSchedule> workSchedule;
	
	@OneToMany(mappedBy="person")
	private Set<BillImport> billImport;
	
	@OneToMany(mappedBy="person")
	private Set<BillExport> billExport;
	
	@OneToOne(mappedBy="PERSON")
	private Doctor doctor;
	
	@OneToMany(mappedBy ="person")
	private Set<TableSalary> tblsalary;
	
	public Set<TableSalary> getTblsalary() {
		return tblsalary;
	}

	public void setTblsalary(Set<TableSalary> tblsalary) {
		this.tblsalary = tblsalary;
	}
	@Column(name = NAME)
	private String name;
	
	@Column(name = ADDRESS)
	private String address;
	
	@Column(name = EMAIL)
	private String email;
	
	@Column(name =DOB)
	private String dob;
	
	@Column(name = POSITIONS)
	private String position;
	
	@Column(name = USERNAME)
	private String username;
	
	@Column(name = PASSWORD)
	private String password;
	
	@Column(name = AVATAR)
	private  String avatar;
	
	@Column(name = PHONE)
	private String phone;
	
	@Column(name = SEX)
	private int sex;
	
	public Person() {
		super();
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<BillImport> getBillImport() {
		return billImport;
	}

	public void setBillImport(Set<BillImport> billImport) {
		this.billImport = billImport;
	}

	public Set<BillExport> getBillExport() {
		return billExport;
	}

	public void setBillExport(Set<BillExport> billExport) {
		this.billExport = billExport;
	}

	public Set<MedicalRecord> getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(Set<MedicalRecord> medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public Set<WorkSchedule> getWorkSchedule() {
		return workSchedule;
	}

	public void setWorkSchedule(Set<WorkSchedule> workSchedule) {
		this.workSchedule = workSchedule;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
