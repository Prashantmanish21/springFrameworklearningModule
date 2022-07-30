package com.springboot.autowiring.withXml;


public class Pizza {
	private Ingredients ingredients;
	private Time time;
	
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza(Ingredients ingredients, Time time) {
		super();
		this.ingredients = ingredients;
		this.time = time;
	}
	
	public Ingredients getIngredients() {
		return ingredients;
	}
	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Pizza [ingredients=" + ingredients + ", time=" + time + "]";
	}

}
