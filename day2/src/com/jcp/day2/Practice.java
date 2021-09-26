package com.jcp.day2;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		int max,min;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		System.out.print("n1 >>>");
		n1 =sc.nextInt();
		System.out.print("n2 >>>");
		n2 =sc.nextInt();
		System.out.print("n3 >>>");
		n3 =sc.nextInt();
		
		if(n1<n2)
		{
			max=n2;
			min=n1;
		}
		else
		{
			max = n1;
			min = n2;
		}
		if(max < n3)
			max=n3;
		
		if(min > n3)
			min=n3;
		System.out.println("n1 = "+n1+", n2 = "+n2+", n3 = "+n3);
		System.out.println("최대값 : "+ max + " , 최소값 : "+ min);
	}

}
