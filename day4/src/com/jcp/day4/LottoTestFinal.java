package com.jcp.day4;

public class LottoTestFinal {

	public static void main(String[] args) {
		//로또테스트 : 1~45 정수값 6개를 랜덤으로 생성합니다.- 배열에 저장 (중복확인)
		int[] lotto = new int[6];
		
		
		for(int i=0; i<lotto.length;i++) {
			double temp = Math.random()*45+1;
			lotto[i] = (int)Math.round(temp-0.5);
			int j;
			System.out.print("  i= "+i+"\t");
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			System.out.println(lotto[i]);
		}
//		for(int i=0; i<lotto.length;i++)
//			System.out.print(lotto[i]+"\t");
	}
}

