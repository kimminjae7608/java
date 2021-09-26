package com.jcp.day9b;

import java.util.Scanner;

public class AnimalCommunity2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String name; int age;	//사용자 정보 저장할 변수
		System.out.println("환영합니다.!!");
		System.out.println("회원정보를 입력하세요.");
		System.out.print("이름 >>>");
		name=sc.nextLine();
		System.out.print("나이>>>");
		age=sc.nextInt();
		
		Member member =new Member(name, age);
		
		System.out.println("[[반려동물 목록을 보여드리겠습니다.]]");
		

		Animal[] animals = new Animal[10];
		animals[0]=new Puppy("브라운");
		animals[1]=new Cat();
		animals[2]=new Rabbit();
		
//		animals[0].setColor("브라운");
		animals[1].setColor("그레이");
		animals[2].setColor("흰색");
		
		//익명클래스(Anonymous) - 이름이 없는 클래스
		animals[3] = new Animal() {	//Inner : 클래스안에서 클래스를 정의하는 것
			
			@Override
			public void sound() {
				System.out.println(this.getColor() + "쥐는 찍찍하고 울어댑니다.");
			}
			
			@Override
			public String getType() {

				return "쥐";
			}
		};
		animals[3].setColor("다크그레이");
		
		animals[4]= new Animal("칼라풀") {
			
			@Override
			public void sound() {
				
				System.out.println(this.getColor() + "앵무새는 안녕~하고 말합니다.");
			}
			
			@Override
			public String getType() {
				// TODO Auto-generated method stub
				return "앵무새";
			}
		};
		
		

		for(int i=0;i<animals.length;i++)
			//현재 animals배열에 3번 인덱스부터는 null객체입니다.	->sound()오류
			//그렇다고 배열의 크기를 줄이거나 배열의 크기에 맞춰 반복하도록 하면 프로그램이 아닙니다.
			//그래서 null 아닐때만 sound()를 실행합니다.
			if(animals[i]!=null) {	//*****
				System.out.print("["+(i+1)+"]");
				animals[i].sound();		//sound() 메소드로 다형성을 구현합니다.
			}
		System.out.println("분양을 원하는 반려동물 선택해주세요.");	
		int index = sc.nextInt();
		//	모모회원이 동물 분양 받을 수 있는지 셀프 체크
		//	강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.
		//2번째 동물
		System.out.println();
		System.out.println("다음 분양을 시도합니다.");

		Animal temp = animals[index-1];
		boolean result = member.isAdopt(temp);
		String message = member.getName() + "회원님은";
		if(temp instanceof Puppy) {
			message+=Puppy.TYPE;
		}
		else if(temp instanceof Cat) {
			message+=Cat.TYPE;
		}
		else if(temp instanceof Rabbit) {
			message+=Rabbit.TYPE;
		}
		else if(temp instanceof Animal) {
			message +=temp.getType();
		}
		print(result, message);
		
		
		
	}
	
	static void print1(String result1, String message) {
		if(result1!=null) {
			System.out.print(message + "분양 가능합니다.");
			System.out.println("😀");
		}
		else {
			System.out.print(message + "분양 자격이 안됩니다.");
			System.out.println("😀");
		}
	}
	
	static void print(boolean result, String message) {
		if(result) {
			System.out.print(message + "분양 가능합니다.");
			System.out.println("😀");
		}
		else {
			System.out.print(message + "분양 자격이 안됩니다.");
			System.out.println("😀");
		}
	}
}





