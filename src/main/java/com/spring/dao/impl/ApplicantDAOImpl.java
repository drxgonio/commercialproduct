package com.spring.dao.impl;

import java.util.List;

import java.util.UUID;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.spring.dao.ApplicantDAO;
import com.spring.entity.Applicant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository 
@Transactional
public class ApplicantDAOImpl extends AbstractIplm<Integer, Applicant> implements ApplicantDAO {

	
 

   /* @Autowired
    private SessionFactory sessionFactory;

	@Override
	public void add(Applicant p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		
	}

	@Override
	public void update(Applicant p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		
	}

	@Override
	public List<Applicant> listApplicant() {
		Session session = this.sessionFactory.getCurrentSession();
	
		List<Applicant> listApplicant = session.createQuery("SELECT c FROM Applicant c",Applicant.class).list();
		listApplicant.forEach(c -> {
		      System.out.println(c.getName());
		    });
		return listApplicant;
	
		   
	}

	@Override
	public Applicant getApplicantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}*/
 
  
 
}