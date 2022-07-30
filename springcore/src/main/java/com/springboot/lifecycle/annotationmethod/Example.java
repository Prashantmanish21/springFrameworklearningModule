package com.springboot.lifecycle.annotationmethod;


public class Example {
	private String subject;
	
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	//@PostConstruct
	public void start() {
		System.out.println("inside init method");
	}
	
	//@PreDestroy
	public void end() {
		System.out.println("inside destroy method");
	}
	

}
