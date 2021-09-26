package test12;

public class Vo {
	
	private String name  ;
	private int age ;
	private String number ;

	public Vo() {
		// 기본생성자
	}
	
	public Vo(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
//	
//	public Vo(String name) {
//		this.name = name;
//	}
//	
	
	//Vo 필드에 있는 변수를 반환해주는 역할 (getter)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNumber() {
		return number;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	//object 클래스
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name = " +name + "age = "+age + "number = "+number;
	}
	
	
}
