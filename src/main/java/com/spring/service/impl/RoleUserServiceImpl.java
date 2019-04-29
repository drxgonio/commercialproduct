package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.IRoleUserDao;
import com.spring.entity.RoleUser;
import com.spring.service.IRoleUserService;
@Service
public class RoleUserServiceImpl implements IRoleUserService{

	@Autowired 
	private IRoleUserDao roleUserDao;
	@Override
	public List<RoleUser> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleUser getByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(RoleUser objetc) {
		// TODO Auto-generated method stub
		roleUserDao.insert(objetc);
		
	}

	@Override
	public void update(RoleUser objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RoleUser getUserRoles(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsername(String username) {
		// TODO Auto-generated method stub
		roleUserDao.deleteUsername(username);
	}

}
