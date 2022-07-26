package com.springboot.constructorInjection.ambuguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmb {
	public static void main(String[]args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/constructorInjection/ambuguity/ambguity.xml");
		
		Addition add=(Addition)context.getBean("add1");
		Addition add1=(Addition)context.getBean("add");
		
		add1.doSum();
		add.doSumagain();
	
		
	}

}
