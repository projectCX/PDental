package com.Dental.entity;


import static com.Dental.dao.AbstractDAO.*;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name= TYPE_OF_SERVICES)
public class TypeOfService extends Entity{
	
	@Column(name = NAME)
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy="typeOfService")
	private Set<Services> service;

	public Set<Services> getService() {
		return service;
	}

	public void setService(Set<Services> service) {
		this.service = service;
	}

	public TypeOfService() {
		super();
	}

	public TypeOfService(String name) {
		super();
		this.name = name;
		this.service = service;
	}
	
	

}
