package com.springboot.qualifierAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQualifier {
	public static void main(String[]args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/qualifierAnnotation/qualify.xml");
		
		MyPet pet=context.getBean("mypet",MyPet.class);
		
		System.out.println(pet);
	}

}
