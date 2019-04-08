package com.spring.service.impl;
import java.util.List;
import java.util.UUID;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.spring.dao.ApplicantDAO;

import com.spring.entity.Applicant;
import com.spring.service.ApplicantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 @Service
public class ApplicantServiceImpl implements ApplicantService {
 
	@Autowired
	private ApplicantDAO applicantDAO;

	@Transactional
	@Override
	public void add(Applicant p) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void update(Applicant p) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	@Transactional

	
	public List<Applicant> listApplicant() {
		
		return applicantDAO.listApplicant();
		
	}

	@Override
	public Applicant getApplicantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
 
  
 
}