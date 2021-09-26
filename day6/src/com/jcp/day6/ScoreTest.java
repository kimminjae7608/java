package com.jcp.day6;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		
		
		Score hong =new Score();
		hong.name = "홍길동";
		Scanner sc=new Scanner(System.in);
		
		hong.kor=sc.nextInt();
		hong.eng=sc.nextInt();
		hong.math=sc.nextInt();
		
		hong.print();
		
		

	}

}
