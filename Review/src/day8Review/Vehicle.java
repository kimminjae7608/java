package day8Review;

public class Vehicle {
	//필드 생성
	private String name;
	private int weight;
	private String color;
	private int speed;
	
	//생성자(기본생성자 or 커스텀생성자)
	
	
	  public Vehicle() {
	  
	  }
	 
	
	public Vehicle(String name, int weight, String color) {
		this.name=name;
		this.weight=weight;
		this.color=color;
		
	}
	
	//private 필드 접근 및 대입
	
	String getName() {
		return name;
	}
	
	int getweight() {
		return weight;
	}
	
	String getColor() {
		return color;
	}
	int getSpeed() {
		return speed;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setWeight(int weight) {
		this.weight=weight;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
	int speedUp(int speed) {
		this.speed+=speed;
		return this.speed;
	}
	
	int speedDown(int speed) {
		this.speed-=speed;
		return this.speed;
	}

	int speedMax() {
		return 140;
	}
	
	void print() {
		System.out.println(name+"의 무게 : "+weight+" 색상 : "+color+" 현재속도 : "+speed);
	}
	
}
