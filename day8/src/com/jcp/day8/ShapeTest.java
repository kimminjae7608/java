package com.jcp.day8;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape sh = new Shape("작은정사각형",23,12);
	
		//get메소드로 리턴받은 값 변수에 저장합니다.
		String shape = sh.getshapeName();
		int width=sh.getwidth();
		int height=sh.getheight();
		int area = sh.getArea();
		
		System.out.println(shape+" - 너비 : "+width + ",높이 : "+height+",면적 : "+area);
		
		Triangle tr = new Triangle("직각삼각형", 34, 10);
		shape = tr.getshapeName();
		width = tr.getwidth();
		height = tr.getheight();
		area = tr.getArea();
		
		System.out.println(shape+" - 너비 : "+width + ",높이 : "+height+",면적 : "+area);
		
		
		
		
	}

}
