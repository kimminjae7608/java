package com.jcp.day4;

public class LottoTest2 {
	//step2
	public static void main(String[] args) {
		//로또테스트 : 1~45 정수값 6개를 랜덤으로 생성합니다.(중복 무시)
		int[] lotto =new int[6];	
		
		for(int i=0; i<=5; i++) {
			double temp =Math.random()*44+1;
			//배열 인덱스 i 로 랜덤값 저장하기
			lotto[i] = (int)Math.round(temp-0.5);
			//버림
		}	
		System.out.println("---- 생성된 6개 랜덤값(난수) 출력");
		for(int i=0;i<6;i++)
			System.out.print(lotto[i]+"\t");
	}
}
