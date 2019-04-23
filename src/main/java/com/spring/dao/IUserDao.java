package com.spring.dao;

import java.util.List;

import com.spring.entity.User;

public interface IUserDao extends IGeneric<String, User>{

	public User getByName(String name);
	 
}
