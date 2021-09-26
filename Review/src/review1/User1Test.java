package review1;


public class User1Test {

	public static void main(String[] args) {
		
		User1 u = new User1("다현",24,1);
		int age = u.getAge();
		int num = u.getNum();
		String name = u.getName();
		System.out.println("age : "+age+"num : "+num+"name : "+name);
		
	}



}
