package com.spring.dao;

import java.util.List;

import com.spring.entity.RoleUser;


public interface IRoleUser extends IGeneric<Integer, RoleUser>{

	public RoleUser getUserRoles(String username);
}
