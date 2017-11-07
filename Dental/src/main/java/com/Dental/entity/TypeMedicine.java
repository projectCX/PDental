package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = TYPE_MEDICINES)
public class TypeMedicine extends Entity{

	@OneToMany(mappedBy="typeMedicine")
	private Set<Medicine> medicine;
	
	@Column(name = NAME)
	private String name;
	
	@Column(name = STATUS)
	private String status ;

	public TypeMedicine() {
		super();
	}

	public Set<Medicine> getMedicine() {
		return medicine;
	}

	public void setMedicine(Set<Medicine> medicine) {
		this.medicine = medicine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
