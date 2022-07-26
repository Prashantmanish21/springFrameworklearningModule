package com.springboot.constructorInjection;

public class Person {
	private String name;
	private int id;
	private Certificate certi;
	
	public Person(String name,int id) {
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.id+"{ "+this.certi+" }";
	}
	public Person(String name,int id,Certificate certi) {
		this.certi=certi;
		this.id=id;
		this.name=name;
	}
	

}
