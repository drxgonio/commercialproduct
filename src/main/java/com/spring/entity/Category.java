package com.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="idCategory")
    private List<Product> product;
	
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
