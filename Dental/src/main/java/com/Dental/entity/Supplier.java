package com.Dental.entity;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import static com.Dental.dao.AbstractDAO.*;

import java.util.Set;

@javax.persistence.Entity
@Table(name = SUPPLIERS)
public class Supplier extends Entity {
	
	@OneToMany(mappedBy="supplier")
	private Set<BillImport> billImport;
	
	@Column(name = NAME)
	private String name;

	@Column(name = ADDRESS)
	private String address;
	
	@Column(name = PHONE)
	private String phone;
	
	@Column(name = EMAIL)
	private String email;
	
	@Column(name = STATUS)
	private String status;

	public Supplier() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
