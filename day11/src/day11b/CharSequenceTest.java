package day11b;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//자바 API 클래스의 인터페이스 활용 테스트입니다.
//CharSequence 인터페이스
public class CharSequenceTest {

	public static void main(String[] args) {
		
		String result = "";
//		String result = new String();
		for(int i=2;i<5;i++) {
			result+=i+"/";	//result 문자열에 i, "/"을 연결하기
			System.out.println(result);
			/* 출력결과 
			 * 2/ 		->다른 문자열에 대해 매번 새로운 String 객체를 만들어 저장합니다.
			 * 2/3/ 		ㄴString 클래스 문제점 : 새로운 문자열을 위해 메모리 사용과 해제에 대한 관리필요
			 * 2/3/4/
			 */
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<5;i++) {
			sb.append(i).append(",");	//문자열의 내용이 바뀌어도 객체가 유지되면서 추가 또는 삭제등의 변경을 합니다.
			System.out.println(sb);		//	ㄴ빈번하게 문자열의 내용이 바뀔때 효율적으로 사용합니다.
		}
		
		StringBuffer sf = new StringBuffer();	//StringBuilder 와 같은 장점. and 멀티스레드에서 사용합니다.
		
		//CharSquence 인터페이스를 구현클래스는 String,StringBuilder, StringBuffer 등이 있습니다.
		String temp="1,2,3,4,5";	
		System.out.println(temp.contains(result));	//인자가 String타입
		System.out.println(temp.contains(sb));		//인자가 StringBuilder타입
		System.out.println(temp.contains(sf));		//인자가 StringBuffer타입
													//	ㄴ contains메소드 인자는 CharSequence 인터페이스 타입
		
		List<String> list = new ArrayList<>();	
		//**ArrayList 참조변수 선언형식. 일반적으로 인터페이스 타입으로 합니다.
		List<String> vector = new Vector<>();	
		//운반하는, ArrayList와 동일한  동작 and 멀티쓰레드 구현
		
		list.add("abc");
		vector.add("xyz");
		
		
	}

}
