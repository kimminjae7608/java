package day8Review;

public class MotorTest {

	public static void main(String[] args) {
		
		Motor texi=new Motor("택시",1500,"yello");
		
		String name;
		int weight=texi.getweight();
		String color;
		int speed=100;
		
		name = texi.getName();
		System.out.println(name);
		
		texi.setName("texi");
		name = texi.getName();
		System.out.println(name);
		
		speed=texi.getSpeed();
		System.out.println(speed);
		
		speed = texi.speedUp(60);
		System.out.println(speed);
		speed=texi.getSpeed();
		System.out.println(speed);
		speed=texi.speedDown(10);
		System.out.println(speed);
		System.out.println(texi.speedMax());
		
		texi.print();
	}

}
