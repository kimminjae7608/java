package com.jcp.day7;

import java.util.Scanner;

public class AddQuizTest {
	static final int COUNT =5;
	public static void main(String[] args) {
		// AddQuiz 를 테스트 해봅니다.
		Scanner sc = new Scanner(System.in);
		AddQuiz[] quiz = new AddQuiz[COUNT]; //AddQuiz 객체가 아직 생성안됬습니다. 배열은 참조값 저장합니다.
//		AddQuiz quiz1;	//위에 배열생성한이유		
//		quiz1 = new AddQuiz(); //객체생성
		
		// 배열을 new 생성한거지, 객체는 생성안됨.
		int cnt =0;	//맞은 갯수 카운트하면서 저장
		
		//문제를 내봅시다. 정수값 범위 11~99
//		System.out.println((int)(Math.random()*89)+11);
		for(int i = 0;i<quiz.length; i++) {
			quiz[i]=new AddQuiz();	//AddQuiz 객체를 생성하여 배열의 i 인덱스가 참조하도록 합니다.
			quiz[i].data1 = (int)(Math.random()*89)+11;
			quiz[i].data2 = (int)(Math.random()*89)+11;
			System.out.println((i+1) + "번. "+quiz[i].data1 +"+" + quiz[i].data2 +"= ?");
			System.out.print("답 입력하세요.>>>");
			quiz[i].userAns= sc.nextInt();
			//정답이면 cnt 증가
			if(quiz[i].makeResult())
				cnt++;
		}
		System.out.println(":::::::::체점 하고 있습니다. :::::");
		System.out.println("\t문제\t\t제출한답\t\t정답\t\t채점");
		for(int i = 0;i<quiz.length; i++) {
			System.out.println("\t"+(i+1)+"번.\t\t 제출한답"+quiz[i].userAns+"\t정답 : "+quiz[i].data1 +quiz[i].data2
					+"\t체점 : "+quiz[i].resultPrint());
		}
		System.out.println("\n: 맞은갯수" +cnt);
		
		
		
	}

}
