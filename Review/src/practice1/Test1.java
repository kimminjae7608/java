package practice1;

public class Test1 {

	public static void main(String[] args) {
		
		//2번문제
		//업캐스팅
		Vehicle1 car = new Motor1("검은색",140,20);
		Vehicle1 cycle = new Cycle1("흰색");
		
		cycle.setMaxSpeed(60);
		cycle.setMinSpeed(5);
		
		print(car.getColor(),car.speedAvg());
		print(cycle.getColor(),cycle.speedAvg());
//		cycle.setUser("다현"); //사용못함
		
		//3번문제
		//다운캐스팅
		Cycle1 bicycle = (Cycle1)cycle;
		bicycle.setUser("다현");
		System.out.println(bicycle.getUser());
		
	}

	static void print(String color, int speedAvg) {
		System.out.println("색상은 : "+color+" 평균속도 : "+speedAvg);
	}
}
