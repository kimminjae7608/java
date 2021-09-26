package com.jcp.day3;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("n의 값을 입력하세요 : ");
		n=sc.nextInt();
		for(int i=1; i<=n;i++)
			sum+=i;
		System.out.println("1부터 " + n + "까지의 합은 "+sum+"입니다.");

	}

}
