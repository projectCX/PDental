package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = MEDICAL_SUPPLIESS)
public class MedicalSupplies extends Entity{
	
	@ManyToOne
	@JoinColumn(name = TYPE_MEDICAL_SUPPLIES_ID)
	private TypeMedicalSupplies typeMedicalSupplies;
	
	@OneToMany(mappedBy="medicalSupplies")
	private Set<DetailBillExportMedicalSupplies> detailBillExportMedicalSupplies;
	
	@OneToMany(mappedBy="medicalSupplies")
	private Set<DetailBillImportMedicalSupplies> detailBillImportMedicalSupplies;
	
	@Column(name = NAME)
	private String name ;
	
	@Column(name = UNIT)
	private String unit;
	
	@Column(name = UNIT_PRICE)
	private float unitPrice ;

	public MedicalSupplies() {
		super();
	}

	public TypeMedicalSupplies getTypeMedicalSupplies() {
		return typeMedicalSupplies;
	}

	public void setTypeMedicalSupplies(TypeMedicalSupplies typeMedicalSupplies) {
		this.typeMedicalSupplies = typeMedicalSupplies;
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

	public Set<DetailBillExportMedicalSupplies> getDetailBillExportMedicalSupplies() {
		return detailBillExportMedicalSupplies;
	}

	public void setDetailBillExportMedicalSupplies(Set<DetailBillExportMedicalSupplies> detailBillExportMedicalSupplies) {
		this.detailBillExportMedicalSupplies = detailBillExportMedicalSupplies;
	}

	public Set<DetailBillImportMedicalSupplies> getDetailBillImportMedicalSupplies() {
		return detailBillImportMedicalSupplies;
	}

	public void setDetailBillImportMedicalSupplies(Set<DetailBillImportMedicalSupplies> detailBillImportMedicalSupplies) {
		this.detailBillImportMedicalSupplies = detailBillImportMedicalSupplies;
	}
	
	
	
	
}
