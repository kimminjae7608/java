package com.jcp.day1;

import java.util.Scanner;	//Scanner 클래스는 기본 클래스가 아니므로 import가 필요합니다.
							//java.lang 패키지에 있는 기본 클래스는 import 없이 사용합니다

public class KeyInputTest {

	public static void main(String[] args) {
		//키보드 입력은 표준 입력 : System 클래스 in 필드를 사용합니다.
		// --> 다양한 데이터 입력을 처리하기 위해 Scanner 클래스를 사용합니다.
		Scanner sc = new Scanner(System.in);	//키보드 입력 준비, 자동 import : ctrl+space
		int num;
		double num1;
		System.out.print("정수값 1개 입력하세요. >>>");
		num = sc.nextInt();						//키보드 입력 실행. 입력내용-> 정수로 처리합니다.
		System.out.println("입력받은 값  : "+ num);
		
		System.out.println("실수값 1개 입력하세요. >>>");
		num1 = sc.nextDouble();
	}

}