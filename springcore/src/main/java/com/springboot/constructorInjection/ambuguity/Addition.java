package com.springboot.constructorInjection.ambuguity;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor :double ,double");

	}
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor :int ,int");
	}
	
	public Addition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("constructor :String ,String");
	}
	
	public void doSum() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a+b);
	}
	public void doSumagain() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("sum is="+ (this.a+this.b));
	}

}
