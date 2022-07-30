package com.springboot.qualifierAnnotation;

public class Pet {
	private String type;
	private String name;
	private String hobby;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String type, String name, String hobby) {
		super();
		this.type = type;
		this.name = name;
		this.hobby = hobby;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + ", hobby=" + hobby + "]";
	}
	
	

}
