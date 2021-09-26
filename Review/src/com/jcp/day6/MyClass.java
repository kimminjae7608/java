package com.jcp.day6;

public class MyClass {
	String name;
	int age;
	static final int number =100;
	static int num =100;
	
	void print() {
		System.out.println("void타입 메소드 출력");
	}
	
	static void print1(int a,int b) {
		System.out.println("static메소드 출력");
//		System.out.println(age); //static메소드는 static(필드 or 메소드)만 접근가능
		System.out.println(a);
		
	}
	void setnum(int num) {
		MyClass.num=num;
	}
	
	void setage(int age) {
		this.age=age;
	}
	
	
}
