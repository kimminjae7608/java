package practice3;

public class LottoTest {
	public static void main(String[] args) {
		
		
		Lotto lotto = new ManualLotto();
		int[]balls;
		
		
		lotto.setBalls(lotto.selectBall());
		
		balls= lotto.getBalls();
		for(int i=0;i<6;i++)
		System.out.print(balls[i]+" ");
		
		
	}
	
	

}
