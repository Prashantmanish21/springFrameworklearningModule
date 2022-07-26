package com.springboot.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCons {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/constructorInjection/consInj.xml","com/springboot/constructorInjection/school.xml");
		
		Person per=(Person)context.getBean("ref1");
		System.out.println(per);
		School sch=(School)context.getBean("sch");
		System.out.println(sch);
		System.out.println(sch.getStudent().get(0).getName());
		System.out.println(sch.getTeacher());
	}

}
