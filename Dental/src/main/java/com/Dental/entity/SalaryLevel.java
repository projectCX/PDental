package com.Dental.entity;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import static com.Dental.dao.AbstractDAO.*;
@javax.persistence.Entity
@Table(name = SALARY_LEVELS)
public class SalaryLevel extends Entity{
	
	@OneToMany(mappedBy ="salaryLevel")
	private Set<TableSalary> tblSalary;
	
	public Set<TableSalary> getTblSalary() {
		return tblSalary;
	}

	public void setTblSalary(Set<TableSalary> tblSalary) {
		this.tblSalary = tblSalary;
	}

	@Column(name = EXPERIENCE)
	private String experience;
	
	@Column(name = TOTAL_SHIFT)
	private int totalShift;
	
	@Column(name = SALARY)
	private int salary;

	public SalaryLevel() {
		super();
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getTotalShift() {
		return totalShift;
	}

	public void setTotalShift(int totalShift) {
		this.totalShift = totalShift;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
