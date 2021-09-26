package day10Review;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name =name;
		this.age=age;
	}
	
	public String  getMember() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	

	@Override
	public String toString() {
		return this.name+"("+this.age+")";
	}
	
	
}
