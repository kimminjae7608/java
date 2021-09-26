package practice3;

import java.util.Scanner;

public class ManualLotto extends Lotto{
	@Override
	public int[] selectBall() {
		int balls[] = new int[6];
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		for(int i=0;i<6;i++)
			balls[i]=sc.nextInt();
		boolean  b=false;
		
		for(int i=0;i<6;i++)
			if(balls[i]>45)
				b=true;
		if(!b)
			break;
		System.out.println("오류입니다.");
		}
		return balls;
	}
}
