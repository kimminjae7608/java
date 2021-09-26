package practice3;

public abstract class Lotto {
	private int balls[];
	
	
	public abstract int [] selectBall();
	
	public int[] getBalls() {
		return this.balls;
	}
	public void setBalls(int[] balls) {
		this.balls=balls;
	}


}


