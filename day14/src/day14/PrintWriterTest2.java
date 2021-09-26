package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// Student 객체를 저정한 ArrayList 데이터를 파일로 출력하기
public class PrintWriterTest2 {

	public static void main(String[] args) {
		
		//사용할 파일 객체 생성
		String fname ="C:\\Users\\82107\\Desktop\\student.txt";
		File file = new File(fname);
		List<Student> stus = new ArrayList<>();
		stus.add(new Student("모모",90,88,79));
		stus.add(new Student("사나",78,84,89));
		stus.add(new Student("정연",82,88,90));
		stus.add(new Student("다현",83,77,88));
		stus.add(new Student("미나",76,90,92));
		stus.add(new Student("쯔위",88,83,78));
		try {
			PrintWriter fpw = new PrintWriter(file);	//File 객체로 출력할 파일 지정합니다.
			for(Student s : stus) {
				fpw.println(s);
			}
			fpw.close();
			System.out.println("파일 출력이 완료되었습니다.");
			
		
		} catch (FileNotFoundException e) {
			System.out.println("파일 경로명/파일명 확인하세요.");
			e.printStackTrace();
		}			
		
		
	}

}
