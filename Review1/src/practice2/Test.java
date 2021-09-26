package practice2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int money;
		Vehicle[] vehicle= new Vehicle[3];
		vehicle[0] = new Motor("택시","노란색",140,20);
		vehicle[1] = new Cycle("두발자전거","파란색");
		vehicle[2] = new Train("KTX", "회색",200,50);
		
		//문제1
		print(vehicle[0].getName(),vehicle[0].avgSpeed());
		
		vehicle[1].setMaxSpeed(60);
		vehicle[1].setMinSpeed(20);
		print(vehicle[1].getName(),vehicle[1].avgSpeed());
		
		print(vehicle[2].getName(),vehicle[2].avgSpeed());
		
		//문제2
		Member user = new Member("아이유",30000);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1.택시비용 50000원\t2.자전거비용 5000원\t3.기차비용 20000원");
		while(true) {
			System.out.print(user.getUser()+"님 잔액을 확인하시겠습니다. 1.yes 2.no  ");
			int input=0;
			input=sc.nextInt();
			
			if(input ==1) {
				System.out.println("잔액은 : " + user.getMoney());
				break;
			}
			else if(input==2) break;
			else
				continue;
		}
		//문제3
		System.out.println("교통수단을 선택해주세요. 1.택시 2.자전거 3.기차");
		int select;
		select =sc.nextInt();
		
		boolean b = user.result(vehicle[select-1],user.getMoney());
		if(b)
			System.out.println(vehicle[select-1].getName()+"를 이용할수 있습니다.");
		else
			System.out.println(vehicle[select-1].getName()+"를 이용할수 없습니다.");
		
		
	}
	
	
	
	
	
	static void print(String name, int maxSpeed) {
		
		System.out.println(name+"의 평균속도는 : " + maxSpeed);	
	}

}
