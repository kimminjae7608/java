package com.jcp.day6;

public class Score {
	String name;
	int kor;
	int eng;
	int math;
	
	int sum() {
		return  kor+eng+math;
	}
	double avg() {
		return (double)sum()/3; //return (double)this.sum()/3;	//this생략가능
	}
	char grade(int score) {
		if(score>=90)
			return 'A';
		else if(score>=80)
			return 'B';
		else if(score>=70)
			return 'C';
		else
			return 'D';
	}
	void print() {
		System.out.print(name+" -"+kor+grade(kor)+" "+eng+grade(eng)+" "
		+math+grade(math)+"  ");
		System.out.print("합계 = "+sum());
		System.out.printf("평균 =%.2f",avg());
		
		
	}
	

}
