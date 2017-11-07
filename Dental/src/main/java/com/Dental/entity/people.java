package com.Dental.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="people")
public class people implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "child", cascade = CascadeType.ALL)
	private Set<party1> partyChild;
	public Set<party1> getPartyChild() {
		return partyChild;
	}
	
	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
	private Set<party1> partyParent;
	
	public Set<party1> getPartyParent() {
		return partyParent;
	}
	
	public people() {
		super();
	}


	public people(String name, Set<party1> partyParent) {
		super();
		
		this.name = name;
		this.partyParent = partyParent;
	}



	public people(int id, String name, Set<party1> partyChild, Set<party1> partyParent) {
		super();
		this.id = id;
		this.name = name;
		this.partyChild = partyChild;
		this.partyParent = partyParent;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setPartyChild(Set<party1> partyChild) {
		this.partyChild = partyChild;
	}

	

	public void setPartyParent(Set<party1> partyParent) {
		this.partyParent = partyParent;
	}
	
	
	
}
