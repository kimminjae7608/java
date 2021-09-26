package day9Review;

import java.util.Scanner;

public class AVehicleTest {

	public static void main(String[] args) {
		
		AVehicle[] vehicle= new AVehicle[3];
		
		vehicle[0]= new AMotor("택시","노란색",140,20);
		vehicle[1]= new ACycle("두발자건거","파란색");
		vehicle[2]= new ATrain("기차","회색",200,40);
		
		print(vehicle[0].getName(),vehicle[0].speedAvg());

		AVehicle a =vehicle[1];
		a.setMaxSpeed(40);	a.setMinSpeed(10);
		print(a.getName(),a.speedAvg());
		
		print(vehicle[2].getName(),vehicle[2].speedAvg());
		
		System.out.println("1. 택시 비용 50000원 \t 2. 자전거 비용 1500원 \t 3. 기차 비용 10000원 ");
		
		Member minjae = new Member("minjae",20000);

		Scanner sc= new Scanner(System.in);
		int input;
		while(true) {
			
		System.out.print(minjae.getName()+"님의 잔액을 확인하시겠습니까? 1.yes 2.no");
		input=sc.nextInt();
		if(input ==1)
			System.out.println("남은잔액 : " + minjae.getmoney());
		else if(input ==2)
			System.out.println("잔액 확인 필요없음.");
		else
			continue;
		break;
		}
		
		boolean use;
		System.out.println("교통수단을 선택해주세요. 1.택시 2.자전거 3.기차");
		input = sc.nextInt();
		use = minjae.result(vehicle[input-1], minjae.getmoney());
		printResult(use, minjae.getName());
		
		
	}
	
	static void print(String name,int speedAvg) {
		System.out.println(name+"평균 속도는 : "+speedAvg + " 입니다.");
	}
	
	static void printResult(boolean use, String user) {
		if(use)
			System.out.println(user+"님은 이용가능합니다.");
		else
			System.out.println(user+"님은 이용할 수 없습니다.");
	}

}
