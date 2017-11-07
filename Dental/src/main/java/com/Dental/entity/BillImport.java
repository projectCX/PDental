package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = BILL_IMPORTS)
public class BillImport extends Entity {
	
	@ManyToOne
	@JoinColumn(name = SUPPLIER_ID)
	private Supplier supplier ;
	
	@ManyToOne
	@JoinColumn(name = PERSON_ID )
	private Person person;
	
	@OneToMany(mappedBy="billImport")
	private Set<DetailBillImportMedicine> detailMedicine;
	
	@OneToMany(mappedBy="billImport")
	private Set<DetailBillImportMedicalSupplies> detailMedicalSupplies;
	
	@Column(name = TOTAL)
	private float total ;
	
	@Column(name = STATUS)
	private String status ;

	public BillImport() {
		super();
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<DetailBillImportMedicine> getDetailMedicine() {
		return detailMedicine;
	}

	public void setDetailMedicine(Set<DetailBillImportMedicine> detailMedicine) {
		this.detailMedicine = detailMedicine;
	}

	public Set<DetailBillImportMedicalSupplies> getDetailMedicalSupplies() {
		return detailMedicalSupplies;
	}

	public void setDetailMedicalSupplies(Set<DetailBillImportMedicalSupplies> detailMedicalSupplies) {
		this.detailMedicalSupplies = detailMedicalSupplies;
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
