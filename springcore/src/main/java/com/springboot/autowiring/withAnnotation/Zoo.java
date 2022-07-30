package com.springboot.autowiring.withAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {
	//property,settermethod,constructormethod
	
	@Autowired
	private Animals animals;
	
	@Autowired
	private Birds birds;
	
	public Zoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zoo(Animals animals, Birds birds) {
		super();
		this.animals = animals;
		this.birds = birds;
	}
	public Animals getAnimals() {
		return animals;
	}
	public void setAnimals(Animals animals) {
		this.animals = animals;
	}
	public Birds getBirds() {
		return birds;
	}
	public void setBirds(Birds birds) {
		this.birds = birds;
	}
	@Override
	public String toString() {
		return "Zoo [animals=" + animals + ", birds=" + birds + "]";
	}
	

}
