package com.spring.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ICategoryDao;
import com.spring.entity.Category;

@Repository
@Transactional
public class CategoryDaoImpl extends AbstractIplm<Integer, Category> implements ICategoryDao{

}
