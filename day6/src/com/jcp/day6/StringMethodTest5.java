package com.jcp.day6;

import java.util.Arrays;

public class StringMethodTest5 {

	//문자열 비교 : 사전식비교(A<b<C<... Z<a<b<c<....<z)메소드
	public static void main(String[] args) {
		// 문자 char, 정수 데이터 형은 값의 비교를 관계연산자(<,>,<=,>=)로 했습니다.
		// 문자열 비교는 못합니다. compareTo 메소드로 합니다.
		String str ="hello";
		
		System.out.println(str.compareTo("cat"));	//str보다 앞에있는 문자열 일때 결과값 > 0
		System.out.println(str.compareTo("hello"));	//str과 같은 문자열 일때 결과 결과값 = 0
		System.out.println(str.compareTo("switch"));//str보다 뒤에있는 문자열 일때 결과값 < 0
		
		
		//문자열의 비교는 대표적인 예로 순서대로 정렬하고 싶을 때 사용할 수 있습니다.
		String[] strArray= {"continue","break","switch","constant","identifier","array","break","print"};
		
		// 정렬을 제공하는 클래스와 그의 메소드. Arrays클래스의 sort 메소드
		Arrays.sort(strArray);	//strArray 배열이 가리키는 문자열을 오름차순으로 정렬한 순서로 참조시킵니다.
		for(int i =0;i<strArray.length;i++)
			System.out.print(strArray[i]+"\t");
		System.out.println();
		System.out.println(Arrays.toString(strArray));
	}
}
