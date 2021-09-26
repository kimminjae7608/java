package com.jcp.day4;

import java.util.Scanner;

public class CypherTest {

	public static void main(String[] args) {
		// 요구사항 : 철수가 미미에게 메시지를 전달하는데 간단한 암호화를 합니다.
		// 			철수는 미미와 key값으로 7이라는 숫자를 알고 있어요.
		// 받은 메시지는 String 타입"XXXXX"	
		// 보내고 싶은 메시지를 복호화하기 위해 => 각 문자에 키값 7을 뺄셈을 합니다
		// 복호화 메시지를 String 타입으로 수신하여 봅니다. (String 타입 결과 출력하세요.)
		Scanner sc = new Scanner(System.in);
		System.out.print("메시지를 입력하시오 : ");
		String message = sc.nextLine(), cypherText="초기화";	//message 입력
		
		int key=7, input;
		char[] temp;
		for(;;) {
			System.out.println("1. 암호화하기  2.복호화하기 3.나머지 입력 -> 종료");
			input=sc.nextInt();
			if(input==1) {
				temp =message.toCharArray();	//String->Char[]로 변환하여 암호화하기 위하여
				for(int i=0; i<temp.length;i++) {
					temp[i]+=key;	//기존 문자열 아스키코드 값에 +key값만큼 한후 암호화하기
				}
				cypherText=String.valueOf(temp);	//char[]-> String으로 변환하여 문자열을 출력하기위하여
				System.out.println(cypherText);
			}
			else if(input==2) {		
				temp =cypherText.toCharArray();	
				for(int i=0; i<temp.length;i++) {
					temp[i]-=key;
					//key 값이 자동으로 casting 되도록 ++,--,+=,-= 연산자를 사용하세요
				}
				message=String.valueOf(temp);
				System.out.println(message);
				}
			else
				break;
			}
		sc.close();	//스캐너 sc 사용종료
		}
}
	

