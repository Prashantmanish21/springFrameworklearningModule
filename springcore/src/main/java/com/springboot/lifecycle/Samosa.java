package com.springboot.lifecycle;

public class Samosa {
	
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

	
	
	public void setPrice(double price) {
		System.out.println("setting property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}

}
