package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="tblroleuser")
public class RoleUser {
	@Id
	@Column(name="idRole")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getNameRole() {
		return nameRole;
	}
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="username")
	 @OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	
	
	@Column(name="nameRole")
	private String nameRole;

}
