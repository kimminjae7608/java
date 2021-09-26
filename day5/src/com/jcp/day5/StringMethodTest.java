package com.jcp.day5;

public class StringMethodTest {

	public static void main(String[] args) {
		// 가장 쉬운 String 메소드 (- 인자가 없는)테스트 합니다.
		String msg1 ="hello~ java 하이 자바!*,";
		String msg2 ="JAVA IS so INTERESTING.";
		
		System.out.println("msg1을 대문자로 변환하면...");
		System.out.println(msg1.toUpperCase());	//메소드 실행 결과값을 직접 출력
		
		System.out.println("msg2을 소문자로 변환하면...");
		System.out.println(msg2.toLowerCase());
		
		System.out.println("msg2을 소문자로 변환하고 변수로 참조하면...");
		String temp = msg2.toLowerCase();	//메소드 실행 결과값을 변수로 참조
		System.out.println(temp);
		
		System.out.println("msg1이 참조하는 문자열의 크기(갯수)는 ?");
		System.out.println(msg1.length());
		System.out.println("msg2이 참조하는 문자열의 크기(갯수)는 ?");
		int len =msg2.length();	//메소드 실행 결과값을 변수에 저장
		System.out.println(len);
		
		msg1=" koreait.2021@gmail.com    ";	//앞뒤 공백제거
		
		System.out.println("[[공백 제거 이전]]");
		System.out.println(msg1);
		System.out.println("[[공백 제거 이후]]");
		System.out.println(msg1.trim());
		

	}

}
