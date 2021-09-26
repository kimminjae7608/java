package com.jcp.day2;

import java.util.Scanner;

public class ifTest1 {

	public static void main(String[] args) {
		
		//관계연산 : 연산결과값은 boolean 값(true, false)
		// == , != , >= , <= , < , > , !(not)
//		boolean bval = 3==4;
//		System.out.println("결과값 : " +bval);
//		bval = (4==4);
//		System.out.println("결과값 : " +bval);
		
		//point 값이 1~100 이면 "일반회원", 100초과이면 "VIP"
		
		int point;
		Scanner sc = new Scanner(System.in);
		point = sc.nextInt();
		
		//요구사항을 따라서 작성
		if(point>100)
			System.out.println("VIP");
		else if(1<=point&&point<=100)
			System.out.println("일반회원");
		else
			System.out.println("다시 입력");
		
		
		
		
	}
}

