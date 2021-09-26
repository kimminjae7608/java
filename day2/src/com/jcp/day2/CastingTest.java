package com.jcp.day2;

//데이터 형식의 변환 : 캐스팅(casting)
public class CastingTest {

	public static void main(String[] args) {
		
		byte byteValue =123;
		int intValue = 123;
		char charValue ='a';
		
		//데이터 타입의 크기가 작은 크기 ~ 큰 형식으로 나열하면
		//byte < short < int < long < float < double 
		// = 는 대입문 이라고 하며 오른쪽의 값을 왼쪽으로 대입
		
		// 오른쪽 값 큰 크기 형식을 왼쪽 작은 크기의 변수에 대입하면 오류.
		// 1)-> 강제변환(캐스팅)은 가능하지만 값이 정확하지 않아진다.
		
//		byteValue =245; 	//오류 :
//		byteValue =(byte)245;
		System.out.println(byteValue);
	
		// 2)큰 크기 형식 = 작은크기 형식 => 자동변환으로 저장된다.
		intValue = byteValue;
		intValue = charValue;
		System.out.println("자동변환된 결과 : "+intValue);
		
		
		//아스키코드값 101을 intValue 에 저장을 해서 해당되는 문자가 무엇인지 출력하시오.
		
		intValue = 101;
		charValue = (char)intValue;
		System.out.println("아스키 코드 : " + intValue + ", 문자 : " + charValue);
		
		
		double doubleValue = 123;
		

		
		
		
		
	}
}
