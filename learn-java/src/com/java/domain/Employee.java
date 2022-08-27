package com.java.domain;

public class Employee extends Person{	
	private int soNamKN;

	public Employee() {
		
	}
	
	public Employee(String name, int soNamKN) {
		super(name);
		this.soNamKN = soNamKN;
	}

	public int getSoNamKN() {
		return soNamKN;
	}

	public void setSoNamKN(int soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	@Override
	public void thongTin() {
		System.out.println("Employee");
	}
}
