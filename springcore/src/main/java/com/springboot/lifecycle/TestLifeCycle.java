package com.springboot.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	public static void main(String[]args) {
		//provided by spring automatically below two method
		//public void init(); :for initialization
		//public void destroy(); :for destroy
		
		//(1):spring bean --> (2):metadata(configuration xml file) -->(3):read and use bean -->(4):then destroy
		
		//calling method:xml config, spring interface, Annotation
		
		//enable pre shudown hook
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/lifecycle/lifecycle.xml");
		
		
		
		Samosa sam=(Samosa)context.getBean("sam");
		System.out.println(sam.toString());
		
		context.registerShutdownHook();
	}

}
