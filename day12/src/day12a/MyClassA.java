package day12a;

//인터페이스 InterfaceA를 사용하는 구현 클래스 -> 객체 생성
public class MyClassA implements InterfaceA{

	@Override
	public void methodA() {
		// TODO 추상메소드 구현 필수!!
		System.out.println("나는 methodA !!");
		
	}

	@Override
	public int methodB(int num) {
		// TODO 추상메소드 구현 필수!!
		System.out.println("나는 methodB !!"+ num);
		return num;
	}
	@Override
	public void methodC(String message) {
		System.out.println("메시지 수 : "+message);
	}
	
	//InterfaceA 의 static 메소드를 별도로 정의할 수 있습니다.
	//이름이 같아도 override 로 처리하지 않습니다.
	public static void medthodD() {
		System.out.println("클래스 메소드");
	}

}
