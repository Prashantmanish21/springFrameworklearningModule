package com.springboot.autowiring.withAnnotation;

import java.util.ArrayList;


public class Animals {
	private ArrayList<String>names;
	
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animals(ArrayList<String> names) {
		super();
		this.names = names;
	}


	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Animals [names=" + names + "]";
	}

}
