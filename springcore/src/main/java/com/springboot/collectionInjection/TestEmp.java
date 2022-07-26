package com.springboot.collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/collectionInjection/collection.xml");
		
		Employee emp=(Employee)context.getBean("bean1");
		System.out.println(emp);
		
		
		System.out.println(emp.getCourses().get("subs"));
		System.out.println(emp.getAddresses().toString());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getPhones());

	}

}
