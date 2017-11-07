package com.Dental.manager.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dental.dao.TypeOfServiceDAO;
import com.Dental.entity.TypeOfService;
import com.Dental.manager.TypeOfServiceManager;

@Service
public class TypeOfServiceManagerImpl implements TypeOfServiceManager{
	@Autowired
	private TypeOfServiceDAO dao;
	
	@Override
	public ArrayList<TypeOfService> getAllTypeOfService() {
		// TODO Auto-generated method stub
		return this.dao.getAll();
	}

	@Override
	public TypeOfService get(int id) {
		// TODO Auto-generated method stub
		return dao.get(id);
	}

	@Override
	public TypeOfService create(String name) {
		// TODO Auto-generated method stub
		return dao.create(name);
	}

	@Override
	public TypeOfService update(int id, String name) {
		// TODO Auto-generated method stub
		return dao.update(id, name);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
