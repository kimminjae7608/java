package com.jcp.day4;

public class LottoTest3 {
	//step3
	public static void main(String[] args) {
		//로또테스트 : 1~45 정수값 6개를 랜덤으로 생성합니다.- 배열에 저장 (중복 무시)
		//int[] lotto =new int[6];	
		int [] lotto = {34,13,24,9,13,1};
		System.out.println(lotto);	//lotto 참조변수 참조값 자체 출력
		for(int i=0; i<6; i++) {
			//double temp =Math.random()*44+1;
			//배열 인덱스 i 로 랜덤값 저장하기
			//lotto[i] = (int)Math.round(temp-0.5);
			
			//중복된 값은 출력 안하기
			int j;
			for(j=0;j<i;j++) {		//i가 4라고 하면 j는 0,1,2,3
				if(lotto[i]==lotto[j]) {	//현재 인덱스 i와 같은값이 배열에 있는지 검사
				break;
				}
			}
			//중복값이 있어서 for를 종료할 때 j의 값과 중복값이 없는 상태로 for를 종료할 때 j의 값을 활용
			if(i==j)	
			System.out.print(lotto[i]+"\t");
		}	
		
		
		System.out.println("---- 생성된 6개 랜덤값(난수) 출력");
		for(int i=0;i<6;i++)
			System.out.print(lotto[i]+"\t");
	}
}
