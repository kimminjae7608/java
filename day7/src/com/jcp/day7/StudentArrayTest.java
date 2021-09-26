package com.jcp.day7;

import java.util.Scanner;
//Student 클래스 배열을 연습합니다.
public class StudentArrayTest {

	static final int SIZE = 3;

	public static void main(String[] args) {
		
		
		//5명의 학생을 처리할 수 있는 배열.
		//stus 배열의 인덱스에 저장된값은 Student 객체를 참조하는 값이다.
		Student[] stus = new Student[5];
		
		stus[0] = new Student("사나", new int[] {72,56,98});
		stus[1] = new Student("다현", new int[] {68,96,99});
		stus[2] = new Student("미나", new int[] {72,66,65});
		stus[3] = new Student("나연", new int[] {78,86,90});
		stus[4] = new Student("지효", new int[] {98,96,95});
		
		for(int i=0; i<stus.length;i++)		//***
			stus[i].printG();

		//배열에 저장된 학생 중에 총점이 230 이상인 학생만 출력(이름, 총점, 평균)하기.
		System.out.println("배열에 저장된 학생 중에 총점이 230 이상인 학생은?");
		for(int i=0; i<stus.length;i++) {
			if(stus[i].sum()>=230) {
				System.out.println("이름 : "+stus[i].name+" \t 총점 : "+stus[i].sum()
						+" 평균 : "+(double)stus[i].sum()/stus[i].scores.length);
			}
				
		}
		//향상된 for문 (또는 빠른 for문, foreach) 를 사용합니다.
		System.out.println("배열에 저장된 학생 중에 총점이 230 이상인 학생은?(1)");
		for(Student s : stus) {	//인덱스 변수 i를 사용하는 대신에 stus의 객체를 하나씩 참조하게 코딩합니다.
			if(s.sum()>=230) {
				System.out.println("이름 : "+s.name+" \t 총점 : "+s.sum()
						+" 평균 : "+(double)s.sum()/s.scores.length);
			}
		}
			
		
		
		//이름이 "미나" 인 학생의 데이터 출력하기 : print() 메소드
		System.out.println("미나 어딨니??");
		for(int i=0; i<stus.length;i++) {
			if(stus[i].name.equals("미나"))
				stus[i].printG();
		}
		
		//검색할 학생 이름 사용자 입력으로 코드 추가
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요..");
		String input = sc.nextLine();
		for(Student s : stus) {
			if(s.name.equals(input)) {
				System.out.println("학생 이름 : "+s.name);	// 이 실행 위치에서 fin,temp,s.name 모두 같은 문자열 참조
				for(int jumsu : s.scores)
					System.out.print("점수 :"+jumsu+"["+s.grade(jumsu)+"]");
			}
		}
		System.out.println();
		
		//foreach 로 수정해보세요.
		for(Student s : stus) {
			String temp = s.name;
			if(temp.equals("미나")) {
				System.out.println("검색 결과 학생 이름 : "+ s.name);
				System.out.println("과목별 성적...........");
				for(int jumsu : s.scores) {
					System.out.print("점수 :"+jumsu+"["+s.grade(jumsu)+"]");					
					
				}
				
			
			}
		}
		System.out.println();
		System.out.println("원래 for문으로 위에 foreach문을 번역한거");
		for(int i=0; i<stus.length; i++) {
			String temp = stus[i].name;
			if(temp.equals("미나")) {
				System.out.println("검색 결과 학생 이름 : "+ stus[i].name);
				System.out.println("과목별 성적...........");
				for(int j=0; j<stus[i].scores.length; j++) {
					System.out.print("점수 :"+stus[i].scores[j]+"("+stus[i].grade(stus[i].scores[j])+")");	
				}
				
			}
		}
			
		
//		int []a=new int[5];
//		for(int k : a)
//			System.out.println(k);
//		for(int k=0; k<a.length;k++)
//			System.out.println(a[k]);

	
	}			
	
}
