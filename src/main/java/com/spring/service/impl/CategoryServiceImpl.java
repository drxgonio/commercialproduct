package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ICategoryDao;
import com.spring.entity.Category;
import com.spring.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ICategoryDao categoryDao;
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		
		return categoryDao.getAll();
	}

	@Override
	public Category getByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Category objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
