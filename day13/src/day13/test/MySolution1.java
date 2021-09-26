package day13.test;

import java.util.Scanner;

public class MySolution1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sum =0;
		System.out.print("정수 1개 입렵 >>>");
		int input;
		input = sc.nextInt();
		
		StringBuilder sb =new StringBuilder("실행결과 ");
		
		while(input!=0) {
			int a = input%10;
			input /= 10;
			sum+=a;
			sb.append(a);
			if(input!=0)
				sb.append("+");
			else
				sb.append(" = ");
			
		}
		sb.append(sum);
		System.out.print(sb);
		
	}

}
