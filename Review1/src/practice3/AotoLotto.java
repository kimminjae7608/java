package practice3;

public class AotoLotto extends Lotto{
	
	@Override
	public int[] selectBall() {
		int balls[]=new int[6];
		
		for(int i=0;i<6;i++)
			balls[i]=(int)(Math.random()*44+1);
			return balls;
	}

}
