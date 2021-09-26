package day13a;

import java.io.FileInputStream;
import java.io.IOException;

//표준입출력 간단하게 테스트합니다.
//파일시스템(바탕화면 test.txt) -> 프로그램 -> 표준출력
public class FileInputTest4 {

	public static void main(String[] args) {

		int b;
		System.out.println("바탕화면에 연습문제.jpg 파일을 다운로드 경로로 복사합니다....");
		try {	
			FileInputStream fis = new FileInputStream("C:\\Users\\82107\\Desktop\\test.txt");
			int count=0;
			
			while((b=fis.read())!=-1) { //입력스트림을 파일로 변경합니다.
				count++;
				
				System.out.write(b);	//문자기반의 메소드로 출력
			}
			fis.close();
			System.out.println(":::" + count+ "바이트 입력! :::");
			
		} catch (IOException e) {
			System.out.println("입력 오류 : "+e.getMessage());
			e.printStackTrace();	//오류내용 추적하여 출력
			
		} finally {
//			fis.close();	//오류 해결해봅시다.
		}
	}
}
