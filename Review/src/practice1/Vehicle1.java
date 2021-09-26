package practice1;

public class Vehicle1 {
	//필드정의
	private String color;
	private int maxSpeed;
	private int minSpeed;
	
	//커스텀 생성자 2개생성
	public Vehicle1(String color) {
		this.color=color;
	}
	
	public Vehicle1(String color, int maxSpeed,int minSpeed) {
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.minSpeed=minSpeed;
	}
	
	//메소드정의
	public int speedAvg() {
		return (this.maxSpeed+this.minSpeed)/2;
	}

	//getter, setter 정의(필드에 접근하기위하여)
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
