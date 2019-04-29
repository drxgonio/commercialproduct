package com.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tbluser")
public class User {

	@Id
	@Column(name="username", nullable = false)
	

	private String username;
	
/*	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	 @JoinColumn(name="username")
    private List<Product> product;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	 @JoinColumn(name="username")
	private Invoicedetails invoicedetails;*/
	
/*	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	 @JoinColumn(name="username")
	private RoleUser roleUser;*/
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	/*public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}*/
/*	public Invoicedetails getInvoicedetails() {
		return invoicedetails;
	}
	public void setInvoicedetails(Invoicedetails invoicedetails) {
		this.invoicedetails = invoicedetails;
	}*/
	
	
	
	//////////////
	@Column(name="password")
	private String password;
	@Column(name="nameUser")
	private String nameUser;
	@Column(name="identityCardNumber")
	private int identityCardNumber;
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	//xá»­ lÃ½ enum
	@Column(name="genDer")
	@Enumerated(EnumType.STRING)
	private  Gender gender;
	public enum Gender { Nam, Nữ }
	
	//
	@Column(name="email")
	private String email;
	@Column(name="phoneNumber")
	private int phoneNumber;
	@Column(name="country")
	private String country;
	@Column(name="address")
	private String address;
	@Column(name="image")
	private String image;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public int getIdentityCardNumber() {
		return identityCardNumber;
	}
	public void setIdentityCardNumber(int identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
