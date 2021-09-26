package jcpdev;

import dao.BuyDao;
import vo.BuyVo;

public class BuyMain {

	public static void main(String[] args) {
		// BuyVo 객체를 생성하세요. - 임의값으로 초기화
		BuyVo vo = new BuyVo(0,"nayeon","LG98T2",3,null);
		//DuyDao의 insert 를 위의 객체로 실행.
		BuyDao buy = BuyDao.getInstance();
		buy.insert(vo);
		//디비버에서 확인
		System.out.println("프로그램 종료!!!");
	}

}