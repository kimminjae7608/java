package com.jcp.day2;

import java.util.Scanner;

// 문자열 데이터를 사용합니다. 핵심 : 자바에서 문자열은 기본데이터형식이 없고 클래스로 사용합니다.
public class StringTest {

	public static void main(String[] args) {
		String name="kim"; // 문자열 "kim"이 메모리에 저장되고 그 위치(주소)는 name에 저장된다.
		System.out.println(name);
		
		name ="choi";	//문자열 "choi"가 메모리에 저장되고 name은 그 위치(주소)를 저장하도록 변경된다.
		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
		String nickname;
		System.out.print("닉네임을 입력하세요.");
		//	nickname = sc.next();	//next() 메소드는 문자열 입력. -공백 이전까지만 저장
		nickname = sc.nextLine();	//입력된 공백을 저장하는지 확인.
		System.out.println("닉네임 확인 :" + nickname);
	}

}