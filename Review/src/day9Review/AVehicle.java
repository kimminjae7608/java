package day9Review;

public abstract class AVehicle {
	
	//필드 선언 private접근 제한
	private String name;
	private String color;
	private int maxSpeed;
	private int minSpeed;
	
	
	//기본생성자 생성
	public AVehicle(){
		
	}
	
	//커스텀 생성자 생성
	public AVehicle(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	public AVehicle(String name, String color, int maxSpeed, int minSpeed) {
		this.name=name; this.color=color;
		this.maxSpeed=maxSpeed; this.minSpeed=minSpeed;
	}
	
	//추상메소드 생성
	public abstract int speedAvg();
	
	
	//필드 변수값 접근하기위하여 getter,setter 생성
	String getName() {
		return name;
	}
	
	String getColor() {
		return color;
	}
	
	int getMaxSpeed() {
		return maxSpeed;
	}
	
	int getMinSpeed() {
		return minSpeed;
	}
	
	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	
	void setMinSpeed(int minSpeed) {
		this.minSpeed=minSpeed;
	}
	
	

}
