package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID, nullable = false)
	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
