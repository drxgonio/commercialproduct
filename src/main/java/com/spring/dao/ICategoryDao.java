package com.spring.dao;

import com.spring.entity.Category;
public interface ICategoryDao extends IGeneric<Integer, Category> {
	
		public Category getByName(String nameCategory);
}
