package com.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcategory")
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idCategory")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategory;
	@Column(name="nameCategory")
	private String nameCategory;
	
	public int getIdCategory() {
		
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		
		this.idCategory = idCategory;
	}
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		
		this.nameCategory = nameCategory;
	}
	

}
