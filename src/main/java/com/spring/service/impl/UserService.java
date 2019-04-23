package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.IUserDao;
import com.spring.entity.User;
import com.spring.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserDao userDao;
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public User getByid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getByName(name);
	}

	

}
