package day9Review;

public class AMotor extends AVehicle {
	
	public AMotor(String name, String color, int maxSpeed, int minSpeed) {
		super(name,color,maxSpeed,minSpeed);
	}
	@Override
	public int speedAvg() {
		return ((this.getMaxSpeed()+this.getMinSpeed())/2);
	}
	

}
