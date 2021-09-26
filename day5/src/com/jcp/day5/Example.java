package com.jcp.day5;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//charAt, length 사용
		//1. 메세지 표시 먼저
		//2. 사용자 ID 입력
		//3. 입력받은 아이디 6글자 이상인지 검사 if 입력받은 아이디<6  false;
	
		Scanner sc = new Scanner(System.in);
		String id ;
		String message = "";
		char ch;
		boolean result = true;	//ID가 조건 불만족일 시 false로 변환
		
		//1. 사용자 ID 입력 전 정보주기
		while(true) {
			System.out.println("1. 회원가입 시 6글자 이상으로 해 주세요");
			System.out.println("2. 시작문자가 숫자이면 안됩니다.");
			System.out.println("3. 특수문자 중에 @를 포함하면 안됩니다.");
			System.out.print(":: 위 조건을 다 읽었으면 등록할 아이디를 입력하세요");
			//2. 사용자 ID 입력
			id = sc.nextLine();
			int len = id.length();
			//3. 입력받은 아이디 6글자 인지 검사
				
			
			if(len<6) {
				message = ("아이디를 6글자 이상해주세요.");
				result =false;
			}else {	//3-1. 6글자 이상이면
				//4. 첫 문자가 숫자인지 검사
				if(id.charAt(0)>='0'&&id.charAt(0)<='9') {
					message = ("아이디는 숫자로 시작할수 없습니다.");
					result = false;
				}else {	//4-1. 숫자가 아니면
					//5. ID의 각 문자마다 검사해서 @있는지 검사
					for (int i = 0; i < len; i++) {
						ch = id.charAt(i);	//CH변수 위에서 선언해도 되더라. 지역변수라서
						if(ch=='@') {
							message = ("@ 기호를 사용할 수 없습니다.");
							result = false;
							break;	//@가 검출되면 더 반복할 이유가 없어서 break로 나와도 됨
						}
						else result =true;
					}// @ 여부검사 for end
				}// 숫자검사 for end
				
			}// 글자 수 검사 for end
			
			// 출력은 3번의 if ~ else 한 묶음 다음에  쓰기
			if(result) { System.out.println("회원가입을 축하합니다!!");
			break;
			}
			else {System.out.println("사용할수 없는 아이디입니다. - " + message);
		continue;}
		}
	}
		}
	
