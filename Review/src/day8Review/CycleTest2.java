package day8Review;

public class CycleTest2 {

	public static void main(String[] args) {
		
		Vehicle cycle =new Cycle("아이유", 50,"purple");
		
		String name=cycle.getName();
		int weight=cycle.getweight();
		String color = cycle.getColor();
		int speed = 20;
		boolean use=true;
		
		speed = cycle.speedUp(speed);
		System.out.println(speed);
		
		cycle.print();
		
		System.out.println(cycle.speedMax());

		System.out.println(use);
		//cycle.use??? 업캐스팅 상태에선 자식의 새로운 필드사용 x
		//다운캐스팅을 해야사용가능	
		
		Cycle c1 =(Cycle)cycle;
		use = c1.use;
		System.out.println(use);
	}

}
