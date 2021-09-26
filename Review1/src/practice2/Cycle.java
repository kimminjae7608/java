package practice2;

public class Cycle extends Vehicle {
	
	public Cycle(String name,String color) {
		super(name,color);
	}
	
	public int avgSpeed() {
		return (getMaxSpeed()+getMinSpeed())/4;
	}

}
