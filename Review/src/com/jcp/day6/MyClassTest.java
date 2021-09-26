package com.jcp.day6;


public class MyClassTest {
	public static void main(String[] args) {
		
		MyClass my =new MyClass();
		
		
		System.out.println(my.name);
		System.out.println(my.age);
//		System.out.println(my.name.length());	//널 객체로 데이터 접근시 에러
		my.name="kimminjae";
		System.out.println(my.name.length());
		my.age=20;
		System.out.println(my.name);
		System.out.println(my.age);
//		System.out.println(my.number);	//static으로 선언된 필드는 클래스명으로 접근
		System.out.println(MyClass.number);
//		MyClass.number=100;	//final로 선언되어 수정 불가(상수)
		System.out.println(my.num);	//static으로 선언된 필드, 클래스 명으로 접근
		MyClass.num= 500;
		System.out.println(MyClass.num);
		
		MyClass.print1(3, 1);
		
		my.print();
		
		
	}

}
