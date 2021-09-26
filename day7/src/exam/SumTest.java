package exam;

import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		Sum []S= new Sum[10];
		int num1,num2;
		int input;
		int number=0, success=0;
		Scanner sc = new Scanner(System.in);
		
		for(Sum Count : S) {
			num1=(int)(Math.random()*90+10);
			num2=(int)(Math.random()*90+10);
			number++;
			Count=new Sum(num1,num2);
			System.out.println(number+"번."+num1+" + "+num2+" = ?" );
			System.out.print("답 >>>");
			input =sc.nextInt();
			
			System.out.print("체점할게요 : ");
			if(input!=Count.add()) {
				System.out.println("X");
				System.out.println("정답은 : "+ Count.add());
			}
			else {
				System.out.println("O");
				success++;
			}
		}
		
		System.out.println("총 맞은갯수 : "+success);
	}
		
		
}

