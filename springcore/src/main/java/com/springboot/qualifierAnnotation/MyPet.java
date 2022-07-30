package com.springboot.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyPet {
	@Autowired
	@Qualifier("pet1")
	private Pet pet;
	
	public MyPet() {
		super();
		System.out.println("inside constructor method");
		// TODO Auto-generated constructor stub
	}
    
	public MyPet(Pet pet) {
		super();
		System.out.println("inside constructor method");
		this.pet = pet;
		
	}


	public Pet getPet() {
		return pet;
	}
    
	public void setPet(Pet pet) {
    	System.out.println("inside setter method");
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "MyPet [pet=" + pet + "]";
	}

}
