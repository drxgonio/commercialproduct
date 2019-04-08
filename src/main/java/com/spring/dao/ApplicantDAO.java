package com.spring.dao;

import java.util.List;

import com.spring.entity.Applicant;
import com.spring.entity.ApplicantInfo;
 
public interface ApplicantDAO {
 
    public Applicant findApplicant(String id);
 
    public List<ApplicantInfo> listApplicantInfos();
 
    public void saveApplicant(ApplicantInfo applicantInfo);
 
    public ApplicantInfo findApplicantInfo(String id);
 
    public void deleteApplicant(String id);
    
}
