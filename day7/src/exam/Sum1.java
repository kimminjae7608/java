package exam;

public class Sum1 {	//작성자 김민재
	
	int num1 ;
	int num2 ;
	int sum=0;
	
	
	public Sum1(){
		
	}
	
	public Sum1(int num1, int num2){
			this.num1=num1;
			this.num2=num2;
			}
	
	int add() {
		return num1+num2;
	}
	int res(int input) {
		if(input==add()) {
			System.out.println("O");
			return 1;
		}
		else {
			System.out.println("X");
			System.out.println("정답은 : "+ add());
			return 0;
		}
	}
	void show(int n) {
		this.sum=n;
		System.out.println("맞은 개수는 : "+this.sum);
	}
}

