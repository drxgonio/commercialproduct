package com.spring.dao.impl;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ICategoryDao;
import com.spring.entity.Category;

@Repository
@Transactional
public class CategoryDaoImpl extends AbstractIplm<Integer, Category> implements ICategoryDao{

	@Override
	public Category getByName(String nameCategory) {
		Query query= sessionFactory.getCurrentSession().
		        createQuery("FROM Category WHERE nameCategory= :nameCategory");
		query.setParameter("nameCategory", nameCategory);
		Category category = (Category) query.uniqueResult();
		 return category;
	}

}
