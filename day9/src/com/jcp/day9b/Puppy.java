package com.jcp.day9b;

public class Puppy extends Animal {
	
	static final String TYPE ="강아지";
	
	public Puppy() {
		// TODO Auto-generated constructor stub
	}
	
	public Puppy(String color) {
		super(color);
//		this.setColor(color);
	}
	
	@Override
	public void sound() {
		System.out.println(this.getColor()+" 강아지🐺멍멍하고 짖습니다..");
		
	}
	
	@Override
	public String getType() {
		return "강아지";
		
	}
}