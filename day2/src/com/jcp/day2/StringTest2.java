package com.jcp.day2;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		
		//논리연산 포함하는 조건
		int intValue=65;
		
		Scanner sc =new Scanner(System.in);
		intValue = sc.nextInt();
		char ch =(char)intValue;
		//요구사항 : intValue 에 저장된 코드값이 대문자, 소문자, 숫자 인지 검색하는 if문
		
		String result;
		if('A'<=ch && ch<='Z')	//대문자 검사
			//System.out.println(ch +" = 대문자입니다.");
			result ="대문자";
		else if('a'<=ch && ch<='z')	//소문자 검사
			//System.out.println(ch +" = 소문자입니다.");		
			result = "소문자";
		else if('0'<=ch && ch<='9')	//숫자
			//System.out.println(ch +" = 숫자입니다.");
			result = "숫자";
		//대문자, 소문자, 숫자에 해당하는 값이 아니면 "분류 : unknown" 출력
		else
			//System.out.println("unknown");
			result = "unknown";
		System.out.println("입력한 아스키코드값: " + intValue+" , 분류 : " +result);

		
	}
}
