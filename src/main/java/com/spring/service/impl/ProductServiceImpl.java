package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.IProductDao;
import com.spring.entity.Product;
import com.spring.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductDao productDao;
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public Product getByid(Integer id) {
		// TODO Auto-generated method stub
		return productDao.getByid(1);
	}

	@Override
	public void insert(Product objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllByIdCategory(int id) {
		// TODO Auto-generated method stub
		return productDao.getAllByIdCategory(id);
	}

}
