package com.spring.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IProductDao;
import com.spring.entity.Product;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractIplm<Integer, Product> implements IProductDao{

	@Override
	public List<Product> getAllByIdCategory(int idCategory) {
		// TODO Auto-generated method stub
		String hql="FROM Product WHERE idCategory= :idCategory";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("idCategory", idCategory);
		return query.list();
	}
	@Override
	public List<Product> getAllByIdCategoryOrderby(int idCategory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String hql="FROM Product WHERE idCategory= :idCategory order by date DESC";
				Query query=sessionFactory.getCurrentSession().createQuery(hql);
				query.setParameter("idCategory", idCategory);
				return query.list();
	}

}
