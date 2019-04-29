package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.IInvoiceDetailsDao;
import com.spring.entity.Invoicedetails;
import com.spring.service.IInvoiceDetailsService;
@Service
public class InvoiceDetailsService implements IInvoiceDetailsService{

	@Autowired
	private IInvoiceDetailsDao invoiceDao;
	@Override
	public List<Invoicedetails> getAll() {
		// TODO Auto-generated method stub
		return invoiceDao.getAll();
	}

	@Override
	public Invoicedetails getByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Invoicedetails objetc) {
		// TODO Auto-generated method stub
		invoiceDao.insert(objetc);
	}

	@Override
	public void update(Invoicedetails objetc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		invoiceDao.delete(id);
	}

}
