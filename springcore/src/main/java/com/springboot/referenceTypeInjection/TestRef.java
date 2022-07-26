package com.springboot.referenceTypeInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springboot/referenceTypeInjection/ref.xml");
        A a=(A)context.getBean("a");
        System.out.println(a);
        System.out.println(a.add());
        System.out.println(a.getObj().getY());
	}
	

}
