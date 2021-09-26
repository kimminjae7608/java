package day12c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		int sel;
		System.out.println("메뉴 번호 선택하세요.");
		for(int i=0;i<menu.length;i++) {
			System.out.println("["+(i+1)+"]"+menu[i]);
		}
		
		try {
			System.out.println("선택>>>");
			sel=sc.nextInt();
			System.out.println("당신이 선택한 메뉴는"+ menu[sel-1] +"입니다.");
		//catch(.... e)는 try 안에서 발생한 Exception 객체 e를 검사
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1~5번를 입력해주세요.");
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			sc.close();			//사용한 자원의 해제
		}
		
	}
}
