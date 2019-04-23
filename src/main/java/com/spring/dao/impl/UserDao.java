package com.spring.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IUserDao;
import com.spring.entity.RoleUser;
import com.spring.entity.User;


@Repository
@Transactional
public class UserDao extends AbstractIplm<String, User> implements IUserDao{

	@Override
	public User getByName(String username) {
		Query query= sessionFactory.getCurrentSession().
		        createQuery("FROM User WHERE username= :username");
		query.setParameter("username", username);
		User name = (User) query.uniqueResult();
		 return name;
	}

	

}
