package com.jcp.day3;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		  int input,sum,money=0;
		  Scanner sc=new Scanner(System.in);
		  while(true) {
			  System.out.println("----------------------------");
			  System.out.println(" 1:예금 | 2:출금 | 3.잔액| 4.종료");
			  System.out.println("----------------------------");
			  input=sc.nextInt();
			  switch(input) {
			  case 1:
				  System.out.print("예금 : 금액을 입력하세요 : ");
				  sum = sc.nextInt();
				  money+=sum;
				  System.out.println("잔액을 확인하세요 : " + money +"원 입니다.");
				  continue;
			  case 2:
				  System.out.print("출금 : 금액을 입력하세요 : ");
				  sum =sc.nextInt();
				  if(money>sum)
					  money-=sum;
				  else
					  System.out.println("잔액이 부족합니다.");
				  System.out.println("잔액을 확인하세요 : " + money+"원 입니다.");
				  continue;
			  case 3:
				  System.out.println("잔액을 확인하세요 : " + money +"원 입니다.");
			  	continue;
			  case 4:
				  System.out.println("종료합니다."); break;
			  }
			  break;
		  }
			 
		//연습문제 : 가상은행의 예금/출금/잔고조회 실행
//				Scanner sc = new Scanner(System.in);
//				boolean run=true;     //반복을 제어할 변수
//				int sel;    //선택 사항 저장
//				int balance=0;	//잔고
//
//				
//				while(run) {   //초기값은 참
//					int money;    //while문에서만 사용할 변수
//					System.out.println("------------------------------");
//					System.out.println("  1:예금 | 2:출금 | 3:잔액 | 4:종료");
//					System.out.println("------------------------------");
//					System.out.print("메뉴 선택 >>> ");
//					sel = sc.nextInt();
//					
//					switch(sel) {
//						case 1:   //예금 처리(예금금액입력->잔액에 더하기)
//							System.out.print("예금액 >");
//							money = sc.nextInt();
//							balance +=money;   //balance=balance+money;
//							//잔고출력
//							System.out.println("현재 잔고 : " + balance);
//							break;
//						case 2:   //출금 처리(출금금액입력->잔액에 빼기)
//							System.out.print("출금액 >");
//							money = sc.nextInt();
//							if(money>balance)
//								System.out.println("잔고가 부족합니다.출금할수 없습니다.");
//							else 
//								balance -= money;
//							//잔고 출력
//							System.out.println("현재 잔고 : " + balance);
//							break;
//						case 3:   //잔고(balance) 출력
//							System.out.print("현재 잔고 : " + balance);
//							System.out.println();   //줄바꿈
//							break;
//						case 4:   //반복 종료
//							System.out.println("프로그램을 종료합니다.");
//							run = false;   //while(조건식)을 거짓으로 함.
//							break;
//						default:  //1,2,3,4 외 나머지 값일 때
//							System.out.println("잘못된 선택입니다.값은 1~4 만 입력하세요.");
//						
//					}
//					//while 반복실행부분의 끝
//				}
	}
}
