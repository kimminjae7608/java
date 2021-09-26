package com.jcp.day1;

import java.util.Scanner;

public class RectangleTest2 {

	public static void main(String[] args) {
		float height, width, area;
		Scanner sc =new Scanner(System.in);
		System.out.println("사각형(rectangle)의 넓이는?");
		System.out.print("높이를 입력하세요(단위m) :");
		height = sc.nextFloat();
		System.out.print("너비를 입력하세요(단위m) :");
		width = sc.nextFloat();
		area = height*width;
		System.out.printf("높이는 : %.3f, 너비는 : %.3f, 넓이는 : %.3f입니다",height,width,area);

	}

}
