package com.jcp.day10;

import java.util.ArrayList;

//ArrayList 활용한 45개중 6개 랜덤 뽑기 : 확률을 1/45-> 1/44 -> 1/43 ...로 변경하도록 구현합니다.
public class LottoFinal {
	public static void main(String[] args) {
		ArrayList<Integer> balls = new ArrayList<>();	//공 45에 대한 리스트
		ArrayList<Integer> lotto = new ArrayList<>();	//뽑힌 공 저장할 배열
		
		for(int i=1;i<=45;i++)
			balls.add(i);
	
		System.out.println(balls);
		
		int j, cnt=45;
		for(int i=0;i<6; i++) {
			double temp =Math.random()*cnt;
			j = (int)Math.round(temp-0.5);
	
			int t =balls.get(j);	//랜덤값 인덱스로 balls 리스트에서 값 가져오기
			lotto.add(t);
			//balls 리스트에서 뽑힌 인덱스 삭제하기
			balls.remove(j);
			System.out.println("뽑은 공번호 :" + lotto);
			System.out.println("현재 남은 공번호 : "+balls);
			cnt--;
			
		}
	
		System.out.println(":::최종 번호:::");
		lotto.sort(null);
		System.out.println(lotto);
	
	
	}
	
}
