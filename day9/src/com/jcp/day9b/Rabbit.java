package com.jcp.day9b;

public class Rabbit extends Animal{
	
	static final String TYPE ="ํ ๋ผ";
	
	@Override
	public void sound() {
		System.out.println(this.getColor()+"ํ ๋ผ๐ฐ๋ ์กฐ์ฉํฉ๋๋ค. ");
	}
	
	@Override
	public String getType() {
		return "ํ ๋ผ";
		
	}
}
