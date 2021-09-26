package test;

import java.sql.Date;
import java.util.Scanner;

import controller.V_CenterMain;
import dao.V_CenterDao;
import dao.V_ConditionDao;
import dao.V_ReservationDao;
import dao.V_UserDao;
import vo.V_CenterVo;
import vo.V_ReservationVo;
import vo.V_UserVo;

public class consol_test {

	public static void main(String[] args) {

		Date now_date = null;
		String n_date = "2021-09-01" ;
		now_date = Date.valueOf(n_date);
		V_UserDao udao = V_UserDao.getInstance();
		V_ReservationDao rdao = V_ReservationDao.getInstance();
		V_CenterDao cdao = V_CenterDao.getInstance();
		V_ConditionDao cdtdao = V_ConditionDao.getInstance(); 
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			
			System.out.println("백신예약사이트에 오신것을 환영합니다.\t");
			System.out.println("현재 시간 : "+ now_date);
			System.out.println("1. 로그인      	2.id찾기            3.회원가입");
			String input = sc.nextLine();

			
			boolean login_result = false;
			V_UserVo U_vo = null;
			
			
			
			if(input.equals("3")) {	//회원가입
				System.out.print("id>>>"); String u_id = sc.nextLine();
				if(udao.u_id_check(u_id)) {
					System.out.print("생년월일>>>"); String u_birth= sc.nextLine();
					System.out.print("성별( M , F )>>>"); String u_gender= sc.nextLine();
					System.out.print("핸드폰번호>>>"); String p_num= sc.nextLine();
					System.out.print("국적(L , F)>>>"); String u_nation= sc.nextLine();
					U_vo = new V_UserVo(u_id,u_birth,u_gender,p_num,u_nation);
					udao.insert(U_vo);
					System.out.println(U_vo);
				}
				else
					System.out.println("이미 사용된 id입니다.");
			}
			
			else if(input.equals("2")) {
				System.out.println("id찾기 화면입니다.");
				System.out.print("핸드폰번호를 입력해주세요>>");
				String id = udao.get_u_id(sc.nextLine());
				System.out.println("사용자 id : " + id +"입니다.");
				
			}
			
			else if(input.equals("1")) {	//로그인 화면
				String u_id, u_birth;
				System.out.print("id를 입력하세요.");
				u_id = sc.nextLine();
				System.out.print("생년월일을 입력하세요.");
				u_birth = sc.nextLine();
				login_result = udao.login_check(u_id, u_birth);
				if(login_result) {
					U_vo = udao.getV_User(u_id);
					System.out.println("로그인 되었습니다.");
				}
				else
					System.out.println("id와 생년월일을 다시 입력해주세요.");
			}
			//로그인 완료
//			System.out.println(U_vo);	//test
	//		login_result =true일때 실행
			while(login_result) {
				System.out.println("백신 메인 화면입니다.");
				System.out.println("1. 백신예약 \t 2. 백신 예약 조회 \t 3. 백신예약 수정 \t 4.나가기");
				String input1 = sc.nextLine();
				V_ReservationVo R_vo = null;
				
				if(input1.equals("1")&&rdao.u_id_check(U_vo.getU_id())) {
				// 1. 백신 예약	
					System.out.println("백신센터 조회 목록입니다.");
					V_CenterMain vc = new V_CenterMain();
					vc.kk();
					V_CenterVo c_vo=null;
					while(true) {
						System.out.print("병원코드을 입력하세요>>>");
						String num = sc.nextLine();
						c_vo = cdao.getCustom(Integer.parseInt(num));
						
//						System.out.println(c_vo);
						if(c_vo!=null) break;
					}
					Date inco_date = null;	
					String inco_date_s = null;
					while(true) {
						System.out.println("접종날짜를 입력해주세요.(yyyy-mm-dd)형식");
						inco_date_s = sc.nextLine();
						inco_date = Date.valueOf(inco_date_s);
						if(now_date.before(inco_date))
							break;
						System.out.println("현재 날짜보다 이전값은 입력할 수 없습니다.");
					}
//					System.out.println(inco_date);
//					System.out.println(U_vo);
//					System.out.println(c_vo);
					// id, 국적은 U_vo에서 가져옴.
					R_vo = new V_ReservationVo(U_vo.getU_id(), c_vo.getS_num(), c_vo.getVaccine(), inco_date, U_vo.getU_nation());
//					System.out.println(R_vo);
					rdao.insert(R_vo);
					cdao.v_count_update(R_vo.getS_num());
					
					R_vo = rdao.getV_Reservation(U_vo.getU_id());
//					System.out.println(R_vo);
					
					login_result = false;
					break;
				}
				else if(input1.equals("1")&&!rdao.u_id_check(U_vo.getU_id()))
					System.out.println("이미 예약된 상태입니다.");
				// 2. 백신 예약 조회
				else if(input1.equals("2")) {
					R_vo = rdao.getV_Reservation(U_vo.getU_id());
					if(R_vo==null)
						System.out.println("예약된 정보가 없습니다.");
					else
						System.out.println(R_vo);
				}
				// 3. 백신 예약 수정(V_ReservationDao 수정관련된 메소드 X)
				else if(input1.equals("3")&&!rdao.u_id_check(U_vo.getU_id())) {
					System.out.println("백신예약 날짜를 입력해주세요.");
					Date date = Date.valueOf(sc.nextLine());
					rdao.update_inoc_date(date, U_vo.getU_id());
					System.out.println("예약 날짜가 수정되었습니다.");
				}
				
				
				// 미완성
				else if(input1.equals("4"))
					break;
			}
			
			System.out.println("1.현재날짜 수정하기 \t 2. 프로그램 종료  \t기타. 초기화면으로 돌아가기 	");
			String input_d = sc.nextLine();
			
			if(input_d.equals("1")) {
				System.out.println("오늘의 날짜를 입력하세요>>");
				n_date = sc.nextLine();
				now_date = Date.valueOf(n_date);
				if(rdao.id_select()!=null) {
					for(V_ReservationVo vo : rdao.all_list()) {
	//					System.out.println(vo);
						if(cdtdao.u_id_check(vo.getU_id()))	//1차접종 해야하는사람
							cdtdao.f_insert(vo, now_date);
						else
							cdtdao.s_update(vo.getU_id(), vo.getInoc_date(), now_date);
					}
					rdao.delete(now_date);
				}
			}
			if(input_d.equals("2"))
				break;
			
		}
		
	}
}
