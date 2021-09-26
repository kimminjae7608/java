package com.jcp.day5;

public class StringExam {
//문제
	public static void main(String[] args) {
		// 문자열 "kor_sec20_21@gamil.com";
		// -> 숫자의 갯수를 출력합니다. 위의 예는 숫자 갯수 총 4개 입니다.
		// 메소드는 charAt 사용하여 문자를 1개씩 검사합니다.
		// 반복횟수는 문자열의 길이를 구하는 length 메소드를 이용합니다.
		String str = "kor_sec20_21@gamil.com";
		int cnt=0;
		for(int i=0; i<str.length();i++) {
			if('0'<=str.charAt(i)&&str.charAt(i)<='9')
				cnt++;	//카운트 증가
		}
		System.out.println("숫자 갯수는 : "+cnt);
	}

}
