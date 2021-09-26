package com.jcp.day9b;

public class Member2 {
	
	private String name;
	private int age;
	
	public Member2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	String isAdopt(Animal animal) {
		//강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.
		// Animal 타입이 실제 객체가 무엇인지는? unknown
		
		if(animal instanceof Puppy && age>=15)
			//instanceof 연산 : 실제 객체 타입를 검사. 클래스 상속객체들에게 사용하는 연산.
			return "강아지";
		else if(animal instanceof Cat && age >=18)
			return "고양이";
		
		else if(animal instanceof Rabbit && age>=13)
			return "토끼";
		else
			return null;
		
	}
	
	public String getName() {
		return name;
	}

}
