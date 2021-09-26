package practice2;

public class Train extends Vehicle{
	
	public Train(String name,String color,int maxSpeed, int minSpeed) {
		super(name,color,maxSpeed,minSpeed);
	}
	
	public int avgSpeed() {
		return getMinSpeed()*2;
	}

}
