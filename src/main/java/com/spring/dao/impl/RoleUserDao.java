package com.spring.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IRoleUser;
import com.spring.entity.RoleUser;
import com.spring.entity.User;

@Repository
@Transactional
public class RoleUserDao extends AbstractIplm<Integer, RoleUser> implements IRoleUser{

	@Override
	public RoleUser getUserRoles(String username) {
		Query query= sessionFactory.getCurrentSession().
		        createQuery("FROM RoleUser WHERE user.username= :username");
		query.setParameter("username", username);
		RoleUser name = (RoleUser) query.uniqueResult();
		 return name;
	}
}
