package com.jcp.day3;

import java.util.Scanner;

public class ForStar {
	public static void main(String[] args) {
		
		int score;
		Scanner inp = new Scanner(System.in);
		System.out.print("평점을 몇 점 주시겠습니다? (1~5)>>> ");
		score = inp.nextInt();
		if(1 <= score && score <= 5) {
		for(int i=1; i<=score;i++)
			System.out.print("★");
		for(int j=score; j<5; j++)
			System.out.print("☆");
		}
	}
}
