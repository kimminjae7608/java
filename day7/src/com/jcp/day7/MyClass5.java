package com.jcp.day7;

public class MyClass5 {

	// 테스트용 필드
	int num;
	int age;
	
	// 기본 생성자	(new연산자를 사용할 때 쓰임)
	// 일반적으로 기본생성자 하나 사용할때는 별도의 실행코드 없다면 생략.
	
	// 주의할 점 : 커스텀 생성자를 사용하면 기본생성자는 생략할 수 없다.
	
	public MyClass5() {
		
	}
	
	
	//커스텀 생성자
	
	  public MyClass5(int num, int age){
	  	this.num=num;
	  	this.age = age;
	  
	  }
	 
	
	
	
	
}
