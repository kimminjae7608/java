package practice2;

public class Motor extends Vehicle{
	
	public Motor(String name,String color, int maxSpeed,int minSpeed) {
		super(name,color,maxSpeed,minSpeed);
	}
	
	@Override
	public int avgSpeed() {
		return (getMaxSpeed()+getMinSpeed())/2;
	}

}
