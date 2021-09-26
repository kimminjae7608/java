package exam;

import java.util.Scanner;

public class Sum1Test {	//작성자 김민재

	public static void main(String[] args) {
		Sum1 []S= new Sum1[10];
		int num1,num2;
		int input;
		int number=0;
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		for(Sum1 Count : S) {
			num1=(int)(Math.random()*90+10);
			num2=(int)(Math.random()*90+10);
			number++;
			Count=new Sum1(num1,num2);
			System.out.println(number+"번."+Count.num1+" + "+Count.num2+" = ?" );
			System.out.print("답 >>>");
			input =sc.nextInt();
			
			System.out.print("체점할게요 : ");
			n+=Count.res(input);
			Count.show(n);
		}
//		 S[9].show(n);
		Sum1 S1 = new Sum1();	//새로 참조변수 선언하면 되는이유를 알겠는데
								//기존 배열로 선언한 참조변수는 왜 못쓰는지 궁금합니다.
		S1.show(n);
		
	}
		
		
}

