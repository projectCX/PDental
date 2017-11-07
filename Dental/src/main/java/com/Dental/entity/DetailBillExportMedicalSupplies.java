package com.Dental.entity;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import static com.Dental.dao.AbstractDAO.*;
@javax.persistence.Entity
@Table(name = DETAIL_BILL_EXPORT_MEDICAL_SUPPLIESS)
public class DetailBillExportMedicalSupplies extends Entity{
	
	@ManyToOne
	@JoinColumn(name = BILL_EXPORT_ID)
	private BillExport billExport ;
	
	@ManyToOne
	@JoinColumn(name = MEDICAL_SUPPLIES_ID)
	private MedicalSupplies medicalSupplies;
	
	@Column(name = QUANTITY)
	private  int quantity;
	
	@Column(name = UNIT_PRICE)
	private float unitPrice ;
	
	@Column(name = TOTAL)
	private  float total;

	public DetailBillExportMedicalSupplies() {
		super();
	}

	public BillExport getBillExport() {
		return billExport;
	}

	public void setBillExport(BillExport billExport) {
		this.billExport = billExport;
	}

	public MedicalSupplies getMedicalSupplies() {
		return medicalSupplies;
	}

	public void setMedicalSupplies(MedicalSupplies medicalSupplies) {
		this.medicalSupplies = medicalSupplies;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	

	
	
}
