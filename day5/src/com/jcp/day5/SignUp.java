package com.jcp.day5;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// 회원가입을 하시오
		
		Scanner sc=new Scanner(System.in);
		String []id= new String[10];
		String s;
		
		int input, i=0;
		for(;;i++) {
			System.out.print("회원가입을 하시겠습니까? 1번 yes 2번 no 기타 다시입력해주세요" );
			input=sc.nextInt();
			sc.nextLine();
			if(input==1);
			else if(input ==2)
				break;
			else
				continue;
		for(;i<10;) {
			System.out.print("id를 입력하세요");
			id[i]=sc.nextLine();
			if(0<i)
				for(int j=0;j<i;j++)
					if(id[i].equals(id[j])) {
						i--;
						System.out.println("중복되었습니다.");
						break;
				}
					else
						continue;
			else
				break;
			break;
		}
	}
}

}
