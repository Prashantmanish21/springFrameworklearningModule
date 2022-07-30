package com.springboot.autowiring.withXml;

public class Ingredients {
	
	private String flour;
	 private String salt;
	 private float quantity;
	 private String sauce;
	 
	 public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingredients(String flour, String salt, float quantity, String sauce) {
		super();
		this.flour = flour;
		this.salt = salt;
		this.quantity = quantity;
		this.sauce = sauce;
	}
	
	public String getFlour() {
		return flour;
	}
	public void setFlour(String flour) {
		this.flour = flour;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	@Override
	public String toString() {
		return "Ingredients [flour=" + flour + ", salt=" + salt + ", quantity=" + quantity + ", sauce=" + sauce + "]";
	}
	 
	 

}
