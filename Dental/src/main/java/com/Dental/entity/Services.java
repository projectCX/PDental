package com.Dental.entity;

import static com.Dental.dao.AbstractDAO.*;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = SERVICES)
public class Services extends Entity{

	@ManyToOne
	@JoinColumn(name = TYPE_SERVICE_ID)
	private TypeOfService typeOfService ;
	
	@OneToMany(mappedBy="service")
	private Set<BillServiceTreatment> billServiceTreatment;
	
	@Column(name = NAME)
	private String name ;
	
	@Column(name = UNIT_PRICE)
	private int unitPrice ;
	
	@Column(name = UNIT)
	private String unit ;
	
	

	public Services() {
		super();
	}

	

	public Services(TypeOfService typeOfService, String name, int unitPrice, String unit) {
		super();
		this.typeOfService = typeOfService;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unit = unit;
	}



	public Set<BillServiceTreatment> getBillServiceTreatment() {
		return billServiceTreatment;
	}



	public void setBillServiceTreatment(Set<BillServiceTreatment> billServiceTreatment) {
		this.billServiceTreatment = billServiceTreatment;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public TypeOfService getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(TypeOfService typeOfService) {
		this.typeOfService = typeOfService;
	}
	
	
}
