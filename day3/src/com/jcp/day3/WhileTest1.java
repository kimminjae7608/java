package com.jcp.day3;

public class WhileTest1 {

	public static void main(String[] args) {
//		while(true) {  //무한반복 for(;;) , 조건식이 참인동안 {} 를 반복
//	    	System.out.println("**");
//	      }
		
		int i=0;	//카운트 변수 i의 초기화
		while(i<5) {	//반복 조건식, 조건이 참일때만 반복
			System.out.println("Hello! Java!");	// 반복 실행한 명령문
			i++;	//카운트 변수 증감식
		}
		
		while(true) {
			System.out.println("하이 자바~~! "+i);
			i++;
			if(i==10) break;
		}
	}
}
