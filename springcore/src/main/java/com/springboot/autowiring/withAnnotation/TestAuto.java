package com.springboot.autowiring.withAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/autowiring/withAnnotation/annotation.xml");
		
		Zoo zoo=context.getBean("zoo",Zoo.class);
		System.out.println(zoo);

	}

}
