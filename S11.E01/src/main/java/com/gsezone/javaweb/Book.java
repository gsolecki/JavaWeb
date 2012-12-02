package com.gsezone.javaweb;

import java.io.Serializable;

public class Book implements Serializable {

	private long id;
	private String title;
	private float price;
	private int isbn;
	
	public Book(long id, String title, float price, int isbn) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.isbn = isbn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
