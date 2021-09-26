package com.jcp.day2;

public class DoubleTest {

	public static void main(String[] args) {
		double d2 = 1.12345678901234567890123456789;	//실수의 기본형식
	      float f2 = 1.12345678901234567890123456789f;
	      System.out.println( "double 1.12345678901234567890123456789 : " + d2 ); // 소수점이하 자리 최대? 16자리 
	      System.out.println( "float 1.12345678901234567890123456789 : " + f2 ); // 소수점이하 자리 최대? 7자리
	      
	      System.out.println("지수형식 2e3 : " + 2e3 );       // 2000.0 
	      System.out.println("지수형식 2e3 : " + 2e-3 );       // 2000.0 
	      // 실수 : 부동소수점형식으로(0,1) 처리하는데 있어서 발생하는 문제점. (연산 결과 2진수를 10진수로 변환해서 출력할 때) 
	      System.out.println( 0.1 + 1.6 ); // 1.7000000000000002 
	      System.out.println( 3.0 / 0.0 ); // Infinity (무한대) : 실수0.0으로 나눈결과.
	      System.out.println( 0.0 / 0.0 ); // NaN : Not a Number
	      /* System.out.println( 3 / 0 ); // 정수 0으로 나눌 때 Error */

	}

}
