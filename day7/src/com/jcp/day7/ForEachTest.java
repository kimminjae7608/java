package com.jcp.day7;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] stus =new Student[5];
		
		stus[0] = new Student("사나", new int[] {78,56,98});
		stus[1] = new Student("모모", new int[] {78,56,98});
		stus[2] = new Student("나연", new int[] {78,56,98});
		stus[3] = new Student("다연", new int[] {78,56,98});
		stus[4] = new Student("지효", new int[] {78,56,98});
	
		//기존의 for
		for(int i=0;i<stus.length;i++) {
			Student stu = stus[i];
			stu.print();
			
		}
		
		System.out.println("::::::::::::::::");
		//foreach
		for(Student stu : stus)
			stu.print();
		
	}
}
