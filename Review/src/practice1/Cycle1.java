package practice1;

public class Cycle1 extends Vehicle1{
	//필드 추가 : 사용자 
	private String user;
	
	public Cycle1(String color) {
		super(color);
	}
	
	//메소드 재정의
	@Override
	public int speedAvg() {
		return (this.getMaxSpeed()+this.getMinSpeed())/4;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user=user;
	}

}
