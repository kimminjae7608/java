package day13a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//표준입출력 간단하게 테스트합니다.
//파일시스템(바탕화면 test.txt) -> 프로그램 -> 표준출력
public class FileIOTest5 {

	public static void main(String[] args) {

		int b;
		byte [] buf=new byte[1024];
		long start = System.currentTimeMillis();
		System.out.println("작성자 : 김민재 -실행시간 테스트입니다.");
		System.out.println("바탕화면에 풍경사진.jpg 파일을 다운로드 경로로 복사합니다.....");
		try {	
			int count=0;
			FileInputStream fis = new FileInputStream("C:\\Users\\82107\\Desktop\\풍경사진.jpg");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\82107\\Downloads\\풍경사진1.jpg");
			//text.txt 파일이 바탕화면에 없으면 FileNotFoundException 발생합니다.
			while((b=fis.read())!=-1) { //입력스트림을 파일로 변경합니다.
//				while((b=fis.read(buf))!=-1) { //입력스트림을 파일로 변경합니다.
				count++;
				
				fos.write(b);	//문자기반의 메소드로 출력
			}
			long end =System.currentTimeMillis();
			System.out.println(":::" + count+ "바이트 복사되었습니다! :::");
			System.out.println("바탕화면에 풍경사진.jpg 파일을 다운로드 경로로 [[바이트 단위]]복사완료");
			System.out.println("실행시간 : "+(end-start)+"ms\n\n");
			fos.close(); fis.close();
			
			Scanner sc= new Scanner(System.in);
			System.out.print("경로를 입력하세요.");
			String fileroot = sc.nextLine();
			System.out.println("파일명 입력하세요.");
			String filename = fileroot+"//"+sc.nextLine();
			System.out.println("바탕화면에 풍경사진.jpg 파일을 다운로드 경로로 [[1024바이트 buf 크기단위로]] 복사합니다.....");
			
			fis = new FileInputStream("C:\\Users\\82107\\Desktop\\풍경사진.jpg");	//다시 객체 생성하기.
			fos = new FileOutputStream(filename);
			//새로운 start
			count=0;
			start=System.currentTimeMillis();
		
			while((b=fis.read(buf))!=-1) {	//read메소드는 읽어온 바이트 크기를 return합니다. - 마지막 실행때는 1024보다 작거나 같습니다.
				count+=b;
				fos.write(buf, 0, b);	//buf 배열의 0번 인덱스부터 읽어온 크기 b 만큼 fos 파일에 출력합니다.
			}
			end=System.currentTimeMillis();
			
			System.out.println(":::" + count+ "바이트 복사되었습니다! :::");
			System.out.println("다운로드 폴더에 풍경사진2.jpg 파일을 다운로드 경로로[[1024바이트 buf 크기단위로]] 복사완료");
			System.out.println("실행시간 : "+(end-start)+"ms");
			
			
			
			fos.close();
			fis.close();
			
		} 	catch (FileNotFoundException e) {
			System.out.println("선택한 파일과 경로명이 잘못되었습니다."+e.getLocalizedMessage());
		}	catch (IOException e) {	//IOException 의 하위클래스를 모두 처리할 수 있습니다.
			System.out.println("입력 오류 : "+e.getMessage());
			e.printStackTrace();	//오류내용 추적하여 출력
		}
	}
}
