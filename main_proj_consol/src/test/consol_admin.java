package test;

import java.util.Scanner;

import dao.V_CenterDao;
import dao.V_ConditionDao;
import dao.V_ReservationDao;
import dao.V_UserDao;
import vo.V_ReservationVo;

public class consol_admin {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		V_UserDao udao = V_UserDao.getInstance();
		V_CenterDao vdao = V_CenterDao.getInstance();
		V_ReservationDao rdao = V_ReservationDao.getInstance();
		V_ConditionDao vcdt_dao = V_ConditionDao.getInstance();
		boolean result = true;
		System.out.println("관리자 모드로 오신것을 환영합니다.");
		System.out.println("1. 전체조회 \t 2. id검색 \t 3.병원코드 조회 \t 4.접종확인서 출력 \t 5. 종료");
		while(result) {
			switch(sc.nextLine()) {
			case "1" :
				System.out.println("예약 전체 조회입니다.");
				for(V_ReservationVo vo : rdao.all_list())
					System.out.println(vo);
				break;
				
			case "2" :
				System.out.println("예약자 조회입니다.");
				System.out.print("예약자 id를 입력해주세요>>");
				System.out.println(rdao.getV_Reservation(sc.nextLine()));
				break;
				// 연번으로 조회 reservation
				// id로 조회
				// 전체조회
				// 2개
			case "3" :
				System.out.println("예약자 조회입니다.");
				System.out.print("병원코드를 입력해주세요>>");
				System.out.println(rdao.getV_Reservation(Integer.parseInt(sc.nextLine())));
				break;
			case "4" :
				System.out.print("증명서 출력할 사용자 id를 입력해주세요 >>> ");
				vcdt_dao.certificate(sc.nextLine());
				System.out.println("출력이 완료되었습니다.");
				break;
				
			case "5" :
				result = false;
				break;
				
			}
		}
	}

}
