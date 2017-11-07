package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = TABLE_SALARYS)
public class TableSalary extends Entity{
	
	@ManyToOne
	@JoinColumn(name = PERSON_ID)
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = SALARY_LEVEL_ID)
	private SalaryLevel salaryLevel;
	
	@Column(name =TOTAL_SHIFT)
	private int totalShift;
	
	@Column(name =TOTAL_SALARY)
	private int totalSalary;
	
	@Column(name = MONTHS)
	private int months;
	
	@Column(name = YEARS)
	private int years;

	public TableSalary() {
		super();
	}

	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}



	public int getMonths() {
		return months;
	}



	public void setMonths(int months) {
		this.months = months;
	}



	public int getYears() {
		return years;
	}



	public void setYears(int years) {
		this.years = years;
	}



	public SalaryLevel getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(SalaryLevel salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public int getTotalShift() {
		return totalShift;
	}

	public void setTotalShift(int totalShift) {
		this.totalShift = totalShift;
	}

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	
	
}
