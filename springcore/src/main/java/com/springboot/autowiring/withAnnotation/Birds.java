package com.springboot.autowiring.withAnnotation;

import java.util.ArrayList;

public class Birds {
	private ArrayList<String>names;
	
	
	public Birds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Birds(ArrayList<String> names) {
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
		return "Birds [names=" + names + "]";
	}

}
