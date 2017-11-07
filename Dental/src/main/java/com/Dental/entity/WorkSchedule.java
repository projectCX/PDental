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
@Table(name = WORK_SCHEDULES)
public class WorkSchedule extends Entity{
	 @ManyToOne
	 @JoinColumn(name =PERSON_ID)
	 private Person person;
	 
	 @Column(name = DATE_WORK)
	 private Date date;
	 
	 @Column(name = SHIFT)
	 private int shift;
	 
	 @Column(name = ACTIVE)
	 private int active;

	public WorkSchedule() {
		super();
	}

	

	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	 
	 
	 
}
