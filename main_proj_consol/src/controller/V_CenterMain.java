package controller;

import java.util.Scanner;

import dao.V_CenterDao;
import vo.V_CenterVo;

public class V_CenterMain {

	public void kk() {

		Scanner sc = new Scanner(System.in);
		V_CenterDao v_center_dao = V_CenterDao.getInstance();

		int s_num;
		String c_address, c_name, vaccine;
		boolean result = true;
		String menu;
		// 잔여백신 --count

		while (result) {
			System.out.println("[1.전체 리스트 조회 / 2.병원코드검색 / 3.시설명으로 검색 / 4.주소,백신 으로 검색 / 5.종료]");
			System.out.println("메뉴 선택 해주세요");
			menu = sc.nextLine();
//menu next으로 입력받으면 에러가떠요.
//nextLine으로 하면 문제점이 		저 1~5번이 2번뜨는경우가있어요 실행해보겠습니다.	
			switch (menu) {

			// 전체 리스트 조회
			case "1":
				System.out.println("전체 리스트를 조회 합니다");
				for (V_CenterVo vo : v_center_dao.getList())
					System.out.println(vo);
				break;

			case "2":
				System.out.println("병원코드 검색을 선택하셨습니다.");
				System.out.print("병원코드를 입력해주세요 >>> ");
				s_num =Integer.parseInt(sc.nextLine());
				// 연번 존재여부
				if (v_center_dao.getCustom(s_num)==null) {
					System.out.println("없는 번호입니다.");
				} else {
					// 연번으로 내역검색
					System.out.println(v_center_dao.getCustom(s_num));
				}
//				sc.nextLine();
				break;

			case "3":
				System.out.println("병원 이름 입력해주세요");
				c_name = sc.nextLine();
				// 병원 이름으로 검색
				System.out.println(v_center_dao.search_by_name(c_name));
//				sc.nextLine();
				break;

			case "4":
				System.out.println("주소를 입력해 주세요(신주소)");
				c_address = sc.nextLine();
				System.out.println("백신 이름을 입력해주세요");
				vaccine = sc.nextLine();
				// 주소와 백신 종류로 검색
				for (V_CenterVo vo : v_center_dao.search_by_address_vaccine(c_address, vaccine))
					System.out.println(vo);
//				sc.nextLine();
				
				break;

			case "5":
				System.out.println("종료합니다.");
				result = false;
				break;

			default:
				System.out.println("잘못 선택하셨습니다");
				break;
			}
		}
//		sc.close();
	}

}