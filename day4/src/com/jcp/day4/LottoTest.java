package com.jcp.day4;

public class LottoTest {
	//step1
	public static void main(String[] args) {
		//로또테스트 : 1~45 정수값 6개를 랜덤으로 생성합니다. LottoTest.java
		//1) for문으로 출력만 합니다.
		//2) 중복된 값이 나오는 것은 일단은 무시.
		for(int j=1; j<=5; j++) {
			for(int i=0; i<=5; i++) {
				long rd = Math.round(Math.random()*44+1);
				System.out.print(rd+"\t");
			}
			System.out.println();
		}
		for(int i=0; i<=5; i++) {
			long rd = Math.round(Math.random()*44+1);
			System.out.print(rd+"\t");
		}		
		
		for(int i=0; i<=5; i++) {
			double rd =Math.random()*44+1;
			System.out.println("re="+ rd +"\t");
			System.out.println("int temp1 = "+Math.round(rd));
			//버림
			System.out.println("int temp2(버림) ="+ Math.round(rd-0.5));
		}	
	}
}
