package com.spring.dao;
import java.io.Serializable;
import java.util.List;
public interface IGeneric  <ID extends Serializable, T> {
	
	public List<T> getAll();
	
	public T getByid(ID id);
	
	public void insert(T objetc);
	
	public void update(T objetc);
	
	public void delete(ID id);
}
