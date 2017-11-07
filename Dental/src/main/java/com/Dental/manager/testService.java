package com.Dental.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dental.dao.testDAO;
import com.Dental.entity.party1;
import com.Dental.entity.people;


@Service
public class testService {
	@Autowired 
	testDAO testDao;
	
	public ArrayList<Integer> getParentById(int childID){
		return testDao.getListParentID(childID);
	}
//	public ArrayList<Integer> getChildById(int parentID){
//		return testDao.getListChildrenID(parentID);
//	}
	
	public ArrayList<people> getAllChil(){
		return testDao.getAllChild();
	}
	
	public ArrayList<party1> getAllParty(){
		return testDao.getListParty();
	}
	
	
	
}
