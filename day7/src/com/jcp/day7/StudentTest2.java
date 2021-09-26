package com.jcp.day7;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest2 {

	static final int SIZE = 3 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [] scores = new int [SIZE];
		String name;
		//커스텀 생성자를 테스트 합니다.
		System.out.println("이름입력 >>>");
		name = sc.nextLine();
		
		for(int i=0; i<scores.length;i++) {
			System.out.print("과목 "+(i+1)+"점수 입력 ");
			scores[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(scores));
		
		Student sana = new Student(name, scores);
		sana.printG();
	}

}
