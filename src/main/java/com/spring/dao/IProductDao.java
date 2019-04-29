package com.spring.dao;

import java.util.List;

import com.spring.entity.Product;

public interface IProductDao extends IGeneric<Integer, Product>{

	public List<Product> getAllByIdCategory(int idCategory);
	public List<Product> getAllByIdCategoryOrderby(int idCategory);


}
