package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = EMPLOYEES)
public class Employee {
	@Id
	private long ID;
	@OneToOne
	@MapsId
	private Person ACCOUNT;
	public Person getACCOUNT() {
		return ACCOUNT;
	}
	public void setACCOUNT(Person aCCOUNT) {
		ACCOUNT = aCCOUNT;
	}
	
	@Column(name =NAME)
	private String name;
	
	@Column(name =ADDRESS)
	private String address;
	
	@Column(name =EMAIL)
	private String email;
	
	@Column(name =DEGREE)
	private String degree;
		
	@Column(name =SPECIALIZE)
	private String specialize;
	public Employee() {
		super();
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecialize() {
		return specialize;
	}
	public void setSpecialize(String specialize) {
		this.specialize = specialize;
	}
	
	
}
