package com.Dental.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dental.dao.ServiceDAO;
import com.Dental.entity.Services;
import com.Dental.entity.TypeOfService;
import com.Dental.entity.party1;
import com.Dental.entity.people;
import com.Dental.manager.ServiceManager;
import com.Dental.manager.TypeOfServiceManager;
import com.Dental.manager.testService;




@Controller
public class testController {
		@Autowired 
		testService test;
		@Autowired
		TypeOfServiceManager typeManager;
//		@Autowired
//		ServiceManager smanager;
		
		@Autowired
		ServiceDAO dao;
		
		@RequestMapping("/showListParent")
		public String getParent(Model model){
			
			model.addAttribute("list", test.getParentById(1));
			System.out.println(test.getParentById(1));
			return "show";
		}
		
		
		
		@RequestMapping("/showAllChild")
		public String getAll(Model model){
			
			model.addAttribute("list", test.getAllChil());
			
			ArrayList<people> lists = new ArrayList<>();
//			lists = test.getAllChil();
			
//			for(int i=0; i< lists.size(); i++){
//				System.out.println(lists.get(i).getPartyChild());
//				for (party1 p1 : lists.get(i).getPartyChild()) {
//					System.out.println("-------------");
//					System.out.println(p1.getChild().getName());
//				}
//			}	
			return "show";
		}
		
		@RequestMapping("/showAllParty")
		public String getParty(Model model){
			ArrayList<party1> lists = new ArrayList<>();
			lists = test.getAllParty();
			
			for(int i=0; i< lists.size(); i++){
				System.out.println(lists.get(i).getChild().getName());
				
			}	
			model.addAttribute("list", test.getAllParty());
			
			
			return "show-party";
		}
		@RequestMapping("/aaaa")
		public String dotest(Model model) {
			
			Services a = new Services();
			TypeOfService b = new TypeOfService();
			b = typeManager.get(100);
			//a = smanager.update(5, b, "Nạo túi nha chu",100, "răng");
			a = dao.create(2, "Nạo túi nha chu",1000, "răng");
			model.addAttribute("a", a);
			return "testADD";
		}
		
}
