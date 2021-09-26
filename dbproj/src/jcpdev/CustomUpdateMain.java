package jcpdev;

import java.time.LocalDate;
import java.util.Scanner;

import dao.CustomDao;
import vo.CustomVo;

//고객 ID 입력받아서 이메일(입력) 정보 수정하도록합니다. -> 없는 고객ID 입력하면 고객등록하시겠습니까?
public class CustomUpdateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String email;
		CustomDao dao = CustomDao.getInstance();
		CustomVo vo = new CustomVo();
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("::: 고객 데이터 관리 :::");
		System.out.println("회원 정보 수정합니다.");
		System.out.print("아이디 입력 >>>");
		id= sc.nextLine();
		vo.setCustom_id(id);
		if(dao.idcheck(id)) {//중복 id가 아닌경우 회원가입하기
			System.out.println("고객이 아니시군요!!");
			System.out.println("'1'을 누르면 회원가입을 도와드리겠습니다");
			if(sc.nextLine().equals("1")) {
				System.out.println("아이디 : " + id);
				vo.setName(id);
				System.out.print("이름입력>>>");
				vo.setName(sc.nextLine());
				System.out.print("이메일입력>>>");
				vo.setEmail(sc.nextLine());
				System.out.print("나이입력>>>");
				vo.setAge(sc.nextInt());
				dao.insert(vo);
				System.out.println("회원가입되셨습니다.");
			}
			else
				System.out.println("프로그램을 종료합니다.");
			
		}
		else {		//기존고객인 경우 이메일 수정하기
			System.out.println("새로운 이메일 입력>>>");
			email=sc.nextLine();
			vo.setEmail(email);
			dao.update(vo);
			System.out.println("수정되었습니다.!!");
			System.out.println(vo);
			
		}
	}
}