package practice2;

public abstract class Vehicle {
	//필드
	private String name;
	private String color;
	private int maxSpeed;
	private int minSpeed;
	
	//생성자
	public Vehicle(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
	public Vehicle(String name,String color,int maxSpeed,int minSpeed) {
		this.name=name;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.minSpeed=minSpeed;
	}
	
	public abstract int avgSpeed();
	
	
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getMinSpeed() {
		return minSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	
	
	
}
