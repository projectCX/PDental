package com.Dental.api.bean;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.Dental.api.bean.ServiceBean;
public class AddSeviceBean {
	

//	private List<ServiceBean> listService;
	
	@NotNull
	private int hosoId;
//	public List<ServiceBean> getListService() {
//		return listService;
//	}
//	public void setListService(List<ServiceBean> listService) {
//		this.listService = listService;
//	}
	public int getHosoId() {
		return hosoId;
	}
	public void setHosoId(int hosoId) {
		this.hosoId = hosoId;
	}
	public AddSeviceBean( int hosoId) {
		super();
//		this.listService = listService;
		this.hosoId = hosoId;
	}
	public AddSeviceBean() {
		super();
	}
	
	
}
