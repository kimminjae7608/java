package com.jcp.day7;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

	//과목수는 3개 과목
	static final int SIZE = 3;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		char []symbol = new char[SIZE];
		
		
		Student stu1= new Student();
		Student stu2 = new Student("김하나",new int[SIZE]);
		
		
			stu2.name=sc.nextLine();
		for(int i=0; i<SIZE;i++) {
			stu2.scores[i]=sc.nextInt();
			symbol[i] = stu2.grade(stu2.scores[i]);
		}
		stu2.sum();
		stu2.print();
		stu2.printG();
		
		
	}

}
