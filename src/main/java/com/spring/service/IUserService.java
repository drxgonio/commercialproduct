package com.spring.service;

import com.spring.entity.User;

public interface IUserService extends IGenerateService<String, User>{

	public User getByName(String name);
}
