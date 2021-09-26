package day9Review;

public class ATrain extends AVehicle{
	public ATrain(String name, String color,int maxSpeed,int minSpeed) {
		super(name,color,maxSpeed,minSpeed);
	}

	@Override
	public int speedAvg() {
		return this.getMinSpeed()*2;
	}

}
