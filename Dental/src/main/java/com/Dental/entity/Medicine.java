package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = MEDICINES)
public class Medicine extends Entity{

	@ManyToOne
	@JoinColumn(name = TYPE_MEDICINE_ID)
	private TypeMedicine typeMedicine;
	
	@OneToMany(mappedBy="medicine")
	private Set<DetailBillExportMedicine> detailBillExport;
	
	@OneToMany(mappedBy="medicine")
	private Set<DetailBillImportMedicine> detailBillImport;
	
	@OneToMany(mappedBy="medicine")
	private Set<Prescription> prescription;
	
	@Column(name = NAME )
	private String name ;
	
	@Column(name = UNIT)
	private String unit ;
	
	@Column(name = UNIT_PRICE)
	private float unitPrice ;

	public Medicine() {
		super();
	}
	
	
	public Set<DetailBillExportMedicine> getDetailBillExport() {
		return detailBillExport;
	}


	public void setDetailBillExport(Set<DetailBillExportMedicine> detailBillExport) {
		this.detailBillExport = detailBillExport;
	}


	public Set<DetailBillImportMedicine> getDetailBillImport() {
		return detailBillImport;
	}


	public void setDetailBillImport(Set<DetailBillImportMedicine> detailBillImport) {
		this.detailBillImport = detailBillImport;
	}


	public Set<Prescription> getPrescription() {
		return prescription;
	}


	public void setPrescription(Set<Prescription> prescription) {
		this.prescription = prescription;
	}


	public TypeMedicine getTypeMedicine() {
		return typeMedicine;
	}

	public void setTypeMedicine(TypeMedicine typeMedicine) {
		this.typeMedicine = typeMedicine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
