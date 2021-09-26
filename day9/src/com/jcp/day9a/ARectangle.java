package com.jcp.day9a;

public class ARectangle extends AShape{

	//기본생성자, 커스텀 생성자 정의.
	public ARectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public ARectangle(String shapeName, int width, int height) {
		super(shapeName,width,height);
		
	}
	
	
	@Override
	public int getArea() {
		int result = this.getHeight()*this.getWidth();
		return result;
	}

}
