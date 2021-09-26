package com.jcp.day7;

public class AddQuiz {
	
	//필드	
	int data1;		//문제1
	int data2;		//문제 2, 문제 data1+ data2
	int userAns;	//사용자 입력한 답
	
	//기본생성자
	
	//메소드
	
	boolean makeResult() {	//사용자 입력한 답이 정답인지? O : true , X : false
		if(data1+data2==userAns) return true;
		else return false;
	}
	
	String resultPrint() {	//사용자답 문제 체점 결과 O,X로 표시
		if(makeResult()) return "O";	//data1 + data2 ==userAns 조건검사 대신 메소드 호출
		else return "X";
	}
}
/* 추가로 개선할 수 있는 내용
 * 1. 랜덤값의 범위 예를 들면 11, 99를 커스텀생성자에서 인자로 전달받아
 * 생성자에서 Math.random 실행하고 data1,data2를 초기화한다.
 * 
 * 2. 연산 종류를 +,-,*,/ 선택할 수 있꼬
 * 	AddQuiz 클래스를 OpQuiz로 변경해서 연산결과 메소드 추가하거나
 * 	또는 기존의 makeResult 메소드에 switch 문으로 구현한다.
 * 3. 랜덤값은 중복된 문제 처리
 * 
 */
