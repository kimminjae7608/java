package com.jcp.day10;

import java.util.Arrays;
import java.util.Random;

public class Practice_T {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		int[] datas = new int[20];
		int[] primenums = new int[20];		//소수여부 표시
		int[] a=new int[7];
		int cnt=0;
		while(cnt!=7) {
			cnt=0;
			
			for (int i=0;i<20;i++)  {
				datas[i]=(int)(Math.random()*89+11);
			}
			
			System.out.print(Arrays.toString(datas));   //배열 20개 값 확인 출력
			boolean result=true;
			for(int i=0;i<datas.length;i++) {
				for (int k=2;k<=datas[i]/2;k++) {
					if(datas[i] % k ==0) {
						result=false; break;	
					}	
				}	
				
				if(result) {  cnt++; primenums[i]=1; }
				else primenums[i]=0;
			} //배열 값 검사 끝
			System.out.println( ":::" + cnt);			//소수 갯수 확인 출력
		}//while 끝
		
		//while 종료 . 배열의 소수갯수가 7개일 때
		for (int i=0;i<datas.length;i++)
			System.out.println(datas[i] + "\t" + primenums[i]);
		
//		for(int i=0;1==primenums[i];i++)
//			a[i]=datas[i];
//		for(int i=0;i<a.length;i++)
//			System.out.print(a[i]+" ");
//		System.out.println();
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : " + (endTime-startTime)  +" ms 소요되었습니다.");
	}

}
