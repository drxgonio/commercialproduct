package com.spring.service;

import java.util.List;

import com.spring.entity.Product;

public interface IProductService extends IGenerateService<Integer, Product>{

	public List<Product> getAllByIdCategory(int id);
	public List<Product> getAllByIdCategoryOrderby(int idCategory);
}
