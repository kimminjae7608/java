package com.jcp.day3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		
		//사용자 반복입력
		//CastingTest.java 예제 중에서 아래 코드 중 intValue 사용자 입력받아서 반복해 줍니다.
		/*
		 * intValue = 101; charValue = (char)intValue; System.out.println("아스키 코드 : " +
		 * intValue + ", 문자 : " + charValue);
		 */
		Scanner sc=new Scanner(System.in);
		int intValue;
		char charValue;
		
		while(true) {	//종료조건 ㅣ intValue 값이999면 종료
			System.out.println("아스키코드 정수 값 입력하세요.(32~126)>>>");
			intValue = sc.nextInt();
			if(intValue ==999)break;
			if(intValue<32||intValue>126) {
				System.out.println("다시 입력하세요.");
				continue;	//다시 while 처음으로가서 계속 진행.
			}
			charValue=(char)intValue;
			System.out.println("아스키코드 : "+intValue+",문자 : "+charValue);
		}
		System.out.println("프로그램을 종료합니다.");
		
		//추가적인 연습은 StringTest2.java코드를 적용해서 아스키코드값의 분류를 출력해보기.
	}
}