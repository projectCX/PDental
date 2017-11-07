package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@javax.persistence.Entity
@Table(name =BILL_SERVICE_TREATMENTS)
public class BillServiceTreatment extends Entity{
	
	@ManyToOne
	@JoinColumn(name = TREATMENT_TICKET_ID)
	private TreatmentTicket treatmentTicket ;
	
	@ManyToOne
	@JoinColumn(name = SERVICE_ID)
	private Services service ;
	
	@Column(name = QUANTITY)
	private int quantity;
	
	@Column(name = DISCOUNT )
	private float discount ;
	
	@Column(name = TOTAL)
	private float total ;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public BillServiceTreatment() {
		super();
	}

	public TreatmentTicket getTreatmentTicket() {
		return treatmentTicket;
	}

	public void setTreatmentTicket(TreatmentTicket treatmentTicket) {
		this.treatmentTicket = treatmentTicket;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}
	
	
}
