package day8Review;

public class Cycle extends Vehicle {
	
	public Cycle(String name, int weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}
	
	boolean use;	//자식 필드 새로생성
	
		int speedMax() {	//오버라이딩
			return 60;
		}
		
}
