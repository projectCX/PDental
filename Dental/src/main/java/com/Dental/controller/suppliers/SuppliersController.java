package com.Dental.controller.suppliers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Dental.dao.SupplierDAO;
import com.Dental.manager.SupplierManager;

@Controller
public class SuppliersController {
	
	@Autowired
	SupplierAction action;
	@Autowired
	private SupplierDAO dao;

	@RequestMapping("/abc")
	public String getBrower() {
		return "home";
	}
	
	@RequestMapping("/supplier/suppliersBrower")
	public String getSuppliers(Model model) {
		getSupplierAction();
		action.doDefault();
		model.addAttribute("action", action);
		System.out.println("__________________"+action.getListSuppliers().size());
		return "/suppliers/suppliersBrowser";
	}
	
	@RequestMapping("/DeleteSupplies")
	public String doDelete(Model model, @RequestParam(required = false) int id) {
		getSupplierAction();
	    action.setId(id);
	    System.out.println("__________________"+id);
		action.doDelete();
		model.addAttribute("action", action);
		return "/suppliers/suppliersBrowser";
	}


	public SupplierAction getAction() {
		return action;
	}

	public void setAction(SupplierAction action) {
		this.action = action;
	}

  
	public SupplierAction getSupplierAction() {
		return this.action = new SupplierAction(dao);
	}

	
}
