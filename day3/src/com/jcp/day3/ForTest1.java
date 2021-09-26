package com.jcp.day3;

public class ForTest1 {

	public static void main(String[] args) {
		int i;	//for문 실행횟수를 제어하는 변수
		
		for(i=0;i<5;i++)	//아래 출력문을 5번 실행한다. 카운트 변수 i (초기값식;조건식;카운트증감식)
			System.out.println("Hello world!");
		System.out.println("..............");
		for(i=0;i<5;i+=2)
			System.out.println("Hello Java!!`");
		for(i=2; i<5;i++)
			System.out.println("Hi Java!!");
		System.out.println("..................");
		int cnt=100;
		//cnt 변수값을 이용해서 50번 출력하기
		for(;cnt<150;cnt++)
			System.out.println("Good! Java!!!");
		
		
	}
}
