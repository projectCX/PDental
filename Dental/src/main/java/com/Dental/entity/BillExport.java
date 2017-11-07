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
@Table(name = BILL_EXPORTS)
public class BillExport extends Entity {
	

	@ManyToOne
	@JoinColumn(name = PERSON_ID )
	private Person person;
	
	@OneToMany(mappedBy="billExport")
	private Set<DetailBillExportMedicine> detailMedicine;
	
	@OneToMany(mappedBy="billExport")
	private Set<DetailBillExportMedicalSupplies> detailMedicalSupplies;
	
	@Column(name = CREATED_DATE)
	private Date date ;
	
	@Column(name = TOTAL)
	private float total ;
	
	@Column(name = STATUS)
	private String status ;
	
	public BillExport() {
		super();
	}

	

	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	public Set<DetailBillExportMedicine> getDetailMedicine() {
		return detailMedicine;
	}

	public void setDetailMedicine(Set<DetailBillExportMedicine> detailMedicine) {
		this.detailMedicine = detailMedicine;
	}

	public Set<DetailBillExportMedicalSupplies> getDetailMedicalSupplies() {
		return detailMedicalSupplies;
	}

	public void setDetailMedicalSupplies(Set<DetailBillExportMedicalSupplies> detailMedicalSupplies) {
		this.detailMedicalSupplies = detailMedicalSupplies;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
