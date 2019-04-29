package com.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="tblinvoicedetails")
public class Invoicedetails {

	@Id
	@Column(name="idInvoice")
	private int idInvoice;

	public int getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	@Column(name="nameInvoice")
	private String nameInvoice;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="username")
	 @OnDelete(action = OnDeleteAction.CASCADE)
	 private User user;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private int phone;
	public String getNameInvoice() {
		return nameInvoice;
	}

	public void setNameInvoice(String nameInvoice) {
		this.nameInvoice = nameInvoice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProduct")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Product product;
	
	
}
