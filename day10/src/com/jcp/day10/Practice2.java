package com.jcp.day10;

import java.util.ArrayList;

public class Practice2 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		ArrayList<Integer> number=new ArrayList<>(20);
		int[] pNumber = new int[7];
		int num,count=0;
		int check=0;
		
		while(true) {
			//11~99까지 랜덤수 20개 뽑기
			for(int i=0; i<20; i++) {
				num=(int)(Math.random()*89+11);
				number.add(num);
			}
			System.out.println(number);
			
			//소수비교
			System.out.println();
			boolean result;
			for(int i=0; i<number.size();i++) {
				 result=true;
				 for(int j=2; j<number.get(i)/2;j++) {				 
					 
					 if(number.get(i)%j==0) {
						 result = false;
						 
					 break;
					 }
				 }
			//소수면 pNumber배열(int형)에 수소값 대입	 
				 if(result==true) {
					 pNumber[count]=number.get(i);
					 count++;
				 }
				 if(count==7)
					 break;
			 }
			for(int i=19;i<=0;i--) {
				System.out.println(number);
			}

				System.out.println();
				for(int i=0; i<count;i++)
					System.out.print(pNumber[i]+" ");
			check++;
			System.out.println("check : "+check);
			if(count==7)
				 break;
			System.out.println();
			number.clear();
			count=0;
		}
		
		long endTime = System.nanoTime();
	      
	      System.out.println("실행시간 : " + (endTime-startTime)/1000  +" us 소요되었습니다.");
	}

}
