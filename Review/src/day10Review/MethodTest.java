package day10Review;

import java.util.Arrays;

public class MethodTest {

	public static void main(String[] args) {
		
		int a= Math.min(20, 10);
		System.out.println(a);
		
		double [] dou = {3.5,23.12,339.43,12.34577};
		
		String message = Arrays.toString(dou);
		System.out.println(message);
		
		Member[] member = new Member[3];
		member[0]= new Member("사나",30);
		member[1]= new Member("다현",20);
		member[2]= new Member("정연",25);
		
		System.out.println(member[0].toString());
		System.out.println(Arrays.toString(member));
	}

}
