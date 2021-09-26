package com.jcp.day7;

import java.util.Arrays;

//모두 완성되면 제출하세요.
//작성자 : 김민재
public class Student {
	//필드
	
	String name;	//학생이름
	int[] scores;	//배열의 크기는 동적입니다.
	
	
	
	//기본생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//커스텀 생성자 : 2개 필드 초기화
	public Student(String name, int[] scores) {
		this.name=name;
		this.scores=scores;
		
	}
	
	int sum() {
		int result=0;
		for(int i=0; i<scores.length;i++)
			result+=scores[i];
		return  result;
	}
	
	char grade(int score) {
		if(score>=90)
			return 'A';
		else if(score>=80)
			return 'B';
		else if(score>=70)
			return 'C';
		else
			return 'D';
	}
	void print() {
		System.out.println("name : " + name + ",scores : "+Arrays.toString(scores)
		+", 총점 : "+ sum() + ",평균 : "+(double)sum()/scores.length);
		//수정할 예정 점수옆에 (학점) 표시
		
	}
	
	void printG() {
		System.out.print("name : " + name);
		for(int i=0; i<scores.length;i++)
			System.out.print("    "+(i+1)+"번째 과목"+scores[i]+grade(scores[i]));
		System.out.println(", 총점 : "+ sum() + ",평균 : "+(double)sum()/scores.length);
	}
	
	
	
}
	