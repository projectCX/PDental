package com.Dental.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class party1 implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name="child_id")
	private people child;
	public people getChild() {
		return child;
	}
	
	
	@ManyToOne
	@JoinColumn(name="parent_id")
	private people parent;
	public people getParent() {
		return parent;
	}

	public party1() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}




	


	public void setChild(people child) {
		this.child = child;
	}





	public void setParent(people parent) {
		this.parent = parent;
	}

//	public party1(int id, String status, people child, people parent) {
//		super();
//		this.id = id;
//		this.status = status;
//		this.child = child;
//		this.parent = parent;
//	}
	
	
	
	
}
