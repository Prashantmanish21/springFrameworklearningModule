package com.springboot.autowiring.withXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[]args) {
		//feature of spring framework in which spring container inject the dependencies automatically
		//autowiring can't be used to inject primitive and string values
		//A----->B(A DEPENDENT UPON B)
		//byName,byType,constructor
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/autowiring/withXml/withXml.xml");
		Pizza pizza=context.getBean("pizz",Pizza.class);
		
		System.out.println(pizza);
	}

}
