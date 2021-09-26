package day9Review;

public class Member {
	
	private String name;
	private int money;

	public Member(String name, int money) {
		this.name=name;
		this.money=money;
	}
	
	public boolean result(AVehicle vehicle ,int cost) {
		boolean boo;
		if(vehicle instanceof AVehicle && cost>=50000)
			boo=true;
		else if(vehicle instanceof ATrain && cost>=10000)
			boo=true;
		else if(vehicle instanceof ACycle && cost>=2000)
			boo=true;
		else
			boo=false;
		return boo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getmoney() {
		return this.money;
	}
	
	
}
