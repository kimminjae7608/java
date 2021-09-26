package com.jcp.day4;

public class LottoTest4 {//step4 - 작성자 : 김민재 
	
	public static void main(String[] args) {
		//로또테스트 : 1~45 정수값 6개를 랜덤으로 생성합니다.- 배열에 저장 (중복 허용x)
		int[] lotto =new int[6];
		int test,j;
		for(int i=0; i<6; i++) {
			
			do {			
				double temp =Math.random()*45+1;
				test = (int)Math.round(temp-0.5);
				
				//중복된 값은 출력 안하기
				for(j=0;j<i;j++) {		//i가 4라고 하면 j는 0,1,2,3
					if(test==lotto[j]) {	//test와 같은값이 배열에 있는지 검사
						System.out.println("*");
						break;
					}
				}	//for j - end

				//중복값이 없는 상태로 for를 종료할 때 j의 값을 활용 (i와j의 값이 같다.)
			}while(i!=j);	//중복된 값이 있을 때 다시 시작
				lotto[i]=test;	
		}	//for i - end
		
		
		System.out.println("---- 생성된 6개 랜덤값(난수) 출력");
		for(int i=0;i<6;i++)
			System.out.print(lotto[i]+"\t");
	}
}
