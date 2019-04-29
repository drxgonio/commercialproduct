package com.spring.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IRoleUserDao;
import com.spring.entity.RoleUser;
import com.spring.entity.User;

@Repository
@Transactional
public class RoleUserDaoImpl extends AbstractIplm<Integer, RoleUser> implements IRoleUserDao{

	@Override
	public RoleUser getUserRoles(String username) {
		Query query= sessionFactory.getCurrentSession().
		        createQuery("FROM RoleUser WHERE user.username= :username");
		query.setParameter("username", username);
		RoleUser name = (RoleUser) query.uniqueResult();
		 return name;
	}

	@Override
	public void deleteUsername(String username) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("delete RoleUser where user.username= :username");
		query.setParameter("username", username);
		query.executeUpdate();
	}
}
