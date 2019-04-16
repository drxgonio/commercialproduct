package com.spring.model;

import java.sql.Timestamp;

public class ProductM {
	
		private int idProduct;
		private String nameProduct;
		private int idCategory;
		private Timestamp date;
		private int count;
		private String title;
		private String Image;
		private double price;
		private String usedTime;
		public int getIdProduct() {
			return idProduct;
		}
		public void setIdProduct(int idProduct) {
			this.idProduct = idProduct;
		}
		public String getNameProduct() {
			return nameProduct;
		}
		public void setNameProduct(String nameProduct) {
			this.nameProduct = nameProduct;
		}
		public int getIdCategory() {
			return idCategory;
		}
		public void setIdCategory(int idCategory) {
			this.idCategory = idCategory;
		}
		public Timestamp getDate() {
			return date;
		}
		public void setDate(Timestamp date) {
			this.date = date;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getImage() {
			return Image;
		}
		public void setImage(String image) {
			Image = image;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getUsedTime() {
			return usedTime;
		}
		public void setUsedTime(String usedTime) {
			this.usedTime = usedTime;
		}
}
