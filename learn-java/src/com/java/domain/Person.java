package com.java.domain;

public class Person {
	private final double LUONG_CO_BAN = 2000000;
	private String name;
	private Address addres;
	
	public Person() {
		
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}
	
	public void thongTin() {
		System.out.println("Person");;
	}
}
