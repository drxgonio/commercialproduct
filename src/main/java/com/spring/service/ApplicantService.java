package com.spring.service;

import java.util.List;

import com.spring.entity.Applicant;


 
public interface ApplicantService {
 
	public void add(Applicant p);
	public void update(Applicant p);
	public List<Applicant> listApplicant();
	public Applicant getApplicantById(int id);
	public void delete(int id);
    
}
