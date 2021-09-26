package com.jcp.day8;

//Shape 클래스로부터 상속받는다. (extends)
public class Triangle extends Shape{
//보이지는 않지만 자동으로 부모의필드를 상속 받음.
//	ㄴshapeName, width, height 필드를 사용한다.
	
	static final int MAX_WIDTH=90;
	//삼각형 도형의 특성상. 어떤 정보가 필요할까요? 각도
	//자식클래스에서 필요하니까 추가로 필드를 정의.
	boolean reightAngle;	//초기값 false
	
//부모가 사용하지 않는 생성자를 자식클래스가 사용할 수 없습니다.

	public Triangle(String shapeName, int width, int height) {
		//super 키워드 부모클래스. 부모클래스 생성자 호출
		//부모의 필드가 private여서 부모생성자를 호출해야한다.
		super(shapeName, width, height);
		// TODO Auto-generated constructor stub
	}
	
	//삼각형 넓이를 구하는 메소드로 getArea() 수정 -> ※오버라이드※
	//부모클래스의 메소드 동작을 자식클래스가 수정
	//부모클래스의 getArea() 메소드 공식은 삼각형에서는 필요가 없음.
	@Override
	int getArea() {
		return this.getwidth()*this.getheight()/2;
	}
	
//	@Override	//오버라이딩이 아니면 에러! 
				//어노테이션이 없으면 다른 메소드라 인식하고 에러가 안남
//	int getArea(int a) {
//		return this.getwidth()*this.getheight()/2;
//	}
	
//	public void print() {	//final 메소드 오버라이드 안됩니다.
//		System.out.println("나는 트라이앵글입니다.");
//	}
	
//	int getArea() {
//		return width*height/2;
//		//	ㄴ 부모클래스 width, height가 protected일 때
//	}

}
