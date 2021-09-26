package com.jcp.day5;

public class StringMethodTest2 {
	// 결론은 문자열 비교는 equals 메소드만 기억하면 됩니다.
	public static void main(String[] args) {
		
		String msg1 = "test";	//"test" 리터럴 문자열 참조
	      String msg2 = "java";

	      System.out.println("String 타입 참조변수의 참조값이 같은지 비교합니다.");
	      System.out.println("msg1==msg2 : " + (msg1==msg2));
	      
	      String msg3 = "test";	//변수명이 달라도 가리키는 문자열이 같으면 참조값은 동일합니다.
	      						//*자바는 문자열이 같은 것이 있으면 메모리에 또 저장하지 않습니다.
	      System.out.println("msg1==msg3 : " + (msg1==msg3));
	      
	      System.out.println("msg1과 msg3 문자열 내용 비교: " + msg1.equals(msg3));
	      //equals 분석 : 인자?	Object는 모든 클래스의 조상,	리턴형식? boolean
	      
	      String msg4 = new String("test");	//String 객체를 생성하여 참조합니다. 문자열은 "test"
	      									//* new 연산은 같은 문자열이 메모리에 있어도 별도로 메모리를 사용합니다.
	      System.out.println("new 연산으로 생성된 객체의 문자열 비교--------------------");
	      System.out.println("msg1==msg3 : "+(msg1==msg4));	//메모리 위치는 다르므로 거짓
	      System.out.println("msg1과 msg3 문자열 내용 비교 : "+msg1.equals(msg4));	//내용이 같으므로 참
	      
	}
}
