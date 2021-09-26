package day8Review;

public class CycleTest {

	public static void main(String[] args) {
		Cycle cycle =new Cycle("모모자전거",10,"black");
		
		cycle.setName("다현자전거");
		String name=cycle.getName();
		int weight=cycle.getweight();
		String color=cycle.getColor();
		boolean use=true;

		System.out.println(cycle.speedMax());
		use =cycle.use;
		System.out.println(use);
		
		cycle.use=true;
		
		use =cycle.use;
		System.out.println(use);
		
		
		cycle.print();
	}

}
