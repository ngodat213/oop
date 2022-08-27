package com.java.constructor;

public class Book {
	String name;
	String description;
	double price;
	// CONSTUCTOR //
	public Book() {
		
	}
	
	public Book(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public Book(double price) {
		this.price = price;
	}

	// GETTER & SETTER //
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
