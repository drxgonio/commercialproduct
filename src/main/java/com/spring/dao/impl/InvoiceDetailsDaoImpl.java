package com.spring.dao.impl;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IInvoiceDetailsDao;
import com.spring.entity.Invoicedetails;

@Repository
@Transactional
public class InvoiceDetailsDaoImpl extends AbstractIplm<Integer, Invoicedetails> implements IInvoiceDetailsDao{

}
