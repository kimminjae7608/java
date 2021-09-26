package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//student.txt 파일을 읽어와서 ArrayList로 만듭시다.
public class ScannerFileTest3 {

	public static void main(String[] args) {
		List<Student> stus = new ArrayList<>();
		
		//사용할 파일 객체 생성
		String fname ="C:\\Users\\82107\\Desktop\\student1.txt";
		File file = new File(fname);
		
		//실행할 때 PrintWriterTest3.java 먼저 하세요. ->student1.txt 파일이 있어야 실행이 됩니다.
		
		try {
			Scanner fsc = new Scanner(file);	//지정된 File 객체에서 문자열을 읽어옵니다.
			
			//hasNext() - Iterator 반복자 인터페이스 추상메소드. 토큰은 데이터 단위. 반복자는 다음 토큰을 접근하는 메소드
				StringTokenizer stk = new StringTokenizer(fsc.nextLine());
				while(stk.hasMoreTokens()) {
				
				
				stus.add(new Student(stk.nextToken(),
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken())));
				}

				System.out.println(stus);
				fsc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
