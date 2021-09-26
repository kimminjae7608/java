package day10Review;

import java.util.ArrayList;

public class Lotto {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ball = new ArrayList<>();
		ArrayList<Integer> lotto = new ArrayList<>();
		for(int i=1; i<=45;i++) {
			ball.add(i);
		}

		int count=44;
		for(int i=0;i<6;i++) {
			
			int j = (int)(Math.random()*count+0.5);
			lotto.add(ball.get(j));
			ball.remove(j);
			System.out.println(lotto);
			count--;
			
		}
		lotto.sort(null);
		System.out.println(lotto);

	}
} 
