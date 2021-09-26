package com.jcp.day8;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle("직사각형", 20, 15);
		
		int width = rec.getwidth();
		int height = rec.getheight();
		String shapename = rec.getshapeName();
		int area = rec.getArea();
		System.out.println(shapename+" - 너비 : "+width + ",높이 : "+height+",면적 : "+area);
		

	}

}
