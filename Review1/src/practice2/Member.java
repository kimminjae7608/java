package practice2;

public class Member {

	private String user;
	private int money;
	
	public Member(String user,int money) {
		this.user=user;
		this.money=money;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public boolean result(Vehicle vehicle,int money) {
		if(vehicle instanceof Motor && money>=50000)
			return true;
		else if(vehicle instanceof Cycle&&money>=5000)
			return true;
		else if(vehicle instanceof Train&&money >=10000)
			return true;
		else
			return false;
		
	}
	
}
