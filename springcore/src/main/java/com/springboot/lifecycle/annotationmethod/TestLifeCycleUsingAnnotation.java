package com.springboot.lifecycle.annotationmethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleUsingAnnotation {

	public static void main(String[] args) {
	    //@PostConstruct -->init method
		//@PreDestroy     -->destroy method
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/lifecycle/annotationmethod/annot.xml");
		Example ex=(Example)context.getBean("Exam");
		System.out.println(ex);

	}
	
	

}
