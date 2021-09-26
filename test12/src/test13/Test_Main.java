package test13;

import test12.Dao;
import test12.Vo;

public class Test_Main {
	public static void main(String[] args) {
	
		Vo v = new Vo();	//public 생성자
		
		Dao dao = Dao.Instance();	//private 생성자
		
		
		
		Vo v1 = new Vo("momo",15,"25");
		
		v.setName("minjae");
		v.setAge(50);
		v.setNumber("123");
		
		String name = v.getName();
		int age = v.getAge();
		String num = v.getNumber();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(num);
	
		name = v1.getName();
		age = v1.getAge();
		num = v1.getNumber();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(num);
	
		System.out.println(v1);
		
	}
	
	
	
}
