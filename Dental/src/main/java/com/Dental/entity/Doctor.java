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
@Table(name = DOCTORS)
public class Doctor {
	
	@Id
	private int ID;
	@OneToOne
	@MapsId
	private Person PERSON;
	
	
	public Person getPERSON() {
		return PERSON;
	}
	public void setPERSON(Person person) {
		PERSON = person;
	}
	@Column(name = SPECIALIZE)
	private String specialize;
	
	@Column(name = DEGREE)
	private String degree;
	
	@Column(name = EXPERIENCE)
	private String experience;
	
	@Column(name = WORK_HISTORY)
	private String workHistory;
	
	public Doctor() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getSpecialize() {
		return specialize;
	}
	public void setSpecialize(String specialize) {
		this.specialize = specialize;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getWorkHistory() {
		return workHistory;
	}
	public void setWorkHistory(String workHistory) {
		this.workHistory = workHistory;
	}
	
	
	
}
