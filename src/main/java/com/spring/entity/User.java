package com.spring.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="tbluser")
public class User {

	@Id
	@Column(name="username", nullable = false)
	
	@NotBlank(message="Vui long nhap username!!!")
	private String username;
	

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	//////////////
	@Column(name="password")
	 @NotBlank(message="Vui long nhap mat khau")
	private String password;
	@Column(name="nameUser")
	 @NotBlank
	  @Length(min = 5, max = 30,message="Vui long nhap ten tu 5 den 30 ki tu")
	private String nameUser;
	@Column(name="identityCardNumber")
	@Min(value = 1, message = "Chung minh thu phai tu 1-10000 so!!!")
	@Max(value=10000)
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
	@Min(value = 1, message = "So dien thoai tu 1 den 100000000")
	@Max(value=100000000)
	private int phoneNumber;
	
	@Column(name="country")
	private String country;
	@Column(name="address")
	@NotBlank(message="Vui long nhap dia chi!!")
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
