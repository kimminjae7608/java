package com.jcp.day6;

import java.util.Scanner;

public class MyClass1Test {

	public static void main(String[] args) {
		// 우리가 정의한 MyClass1 클래스를 테스트합니다.
		
		//1) MyClass1 클래스의 객체를 생성 : new 연산자
		// my1,my2는 식별자 : 프로그래머가 이름을 정합니다.
		// new 뒤에 MyClass1() 은 생성자 메소드 입니다.
		//	ㄴ 객체가 생성될 때 (메모리에 로드될때) 실행
		//	ㄴ 생성자 메소드 이름은 클래스이름과 같습니다.
		// 	ㄴ 기본생성자는 인자가 없는 형식입니다.
		MyClass1 my1 =new MyClass1();
		MyClass1 my2 = new MyClass1();
		
		//되돌아 보기 : Scanner(인자) 인 생성자 실행되었습니다.
		//			ㄴ 커스텀 생성자
		Scanner sc =new Scanner(System.in);	//in 입력 out 출력
		
		//2) MyClass1 타입의 객체 필드 접근(읽기/쓰기)
		//출력해보기
		System.out.println(my1.field1);	//참조값 타입은 null
		System.out.println(my1.field2);	//수치 기본형 타입은 0
		//객체의 필드에 값을 저장
		my2.field1="class test";
		my2.field2=999;
//		my2.field3 = new double[5];	//배열을 생성해야합니다.
		System.out.println("my 객체의 필드값 확인-----");
		System.out.println(my2.field1);
		System.out.println(my2.field2);
		System.out.println(my2.field3);
//		System.out.println(my2.field3[2]);	//오류? null? 값?
		//30번의 배열 객체 선언이 없으면 2번 요소 접근할 수 없으므로 오류 발생
		//배열의 객체를 생성하지 않으면 2번 인덱스 접근 할 때 오류. 널객체로는 인덱스 2접근 못함
		System.out.println(my2.field1.length());
//		System.out.println(my1.field1.length());	//my1이 널 객체이므로  오류
		
		///\NullPointerException : 널 객체를 대상으로 데이터 접근, 메소드 실행할 때 오류
	
		//final 상수 테스트
//		System.out.println(my1.field4);
//		my2.field4 =9999;	//final 필드는 값을 변경못합니다. 오류
//		System.out.println(my2.field4);

		System.out.println(MyClass1.FIELD4);	//***
//		System.out.println(my1.FIELD4); //클래스 이름으로 접근하기, 이렇게 사용x
		//공유영역에 저장된 필드. 클래스 이름으로 읽어옵니다.
		
		MyClass1.field5=1111;	//static 접근 (클래스이름으로 사용)
		System.out.println(MyClass1.field5);
		my2.field5=9999;				//static 접근할 때 (클래스 이름으로 하기!)
		System.out.println(my2.field5);	//54,55번째 처럼 사용하지 않기
		
		//이전의 static final 예시입니다.
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.BYTES);
	}

}
