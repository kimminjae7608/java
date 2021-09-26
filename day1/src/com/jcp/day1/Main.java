package com.jcp.day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [][]a = new int[5][5];
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		
			for(int j=0;j<5;j++) {
				a[0][j]=1;
			}
		
		for(int i=1;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==0)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}

