package com.Dental.api.bean;

public class ServiceBean {
	
	private int serviceCode;
	private int seviceQuantity;
	public int getServiceCode() {
		return serviceCode;
	}
	
	public void setServiceCode(int serviceCode) {
		this.serviceCode = serviceCode;
	}
	public int getSeviceQuantity() {
		return seviceQuantity;
	}
	public void setSeviceQuantity(int seviceQuantity) {
		this.seviceQuantity = seviceQuantity;
	}

	public ServiceBean(int serviceCode, int seviceQuantity) {
		super();
		this.serviceCode = serviceCode;
		this.seviceQuantity = seviceQuantity;
	}

	public ServiceBean() {
		super();
	}
	
	
	
	
}
