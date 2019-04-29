package com.spring.service;

import com.spring.entity.RoleUser;

public interface IRoleUserService extends IGenerateService<Integer, RoleUser>{

	public RoleUser getUserRoles(String username);
	public void deleteUsername(String username);
}
