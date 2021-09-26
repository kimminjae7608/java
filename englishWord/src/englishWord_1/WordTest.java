package englishWord_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordTest {

	public static void main(String[] args) {

		String fname ="C:\\Users\\82107\\Desktop\\englishWord.txt";
		File file = new File(fname);
		Scanner sc = new Scanner(System.in);
		String english = null;
		String koreans = null;
		boolean loop = true;
		int order = 1;
		String input = null;
		String search = null;
		
		WordMgr word =new WordMgr();
		
		
		while(loop) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.단어추가 2.전체조회 3.검색조회 4.저장하기 (기타 : 종료)");
			input =sc.nextLine();
			
			switch(input) {
			case "1" :
				//단어추가
				System.out.print("영어 입력하세요.>>>");
				english = sc.nextLine();
				System.out.print("뜻을 입력하세요.>>>");
				koreans = sc.nextLine();
				word.add(new Word(english, koreans));
				order++;
				break;
			
			case "2" :
				//전체 조회
				for(Word show : word.searchAll()) {
					System.out.println(show);
				}
				break;
			case "3" :	
				//검색 조회
				System.out.print("단어를 입력하세요 : ");
				search = sc.nextLine();
				System.out.println(word.searchE(search));
				break;
			case "4":
				try {
					PrintWriter fpw = new PrintWriter(file);
					for(Word show : word.searchAll()) {
						fpw.println(show);
					}
					fpw.close();
					System.out.println("파일 출력이 완료되었습니다.");
				
				} catch (FileNotFoundException e) {
					System.out.println("파일 경로명/파일명 확인하세요.");
					e.printStackTrace();
				}
				break;
			default : 
				loop=false;
				
			}
		}
		
	}

}
