package day11c;

import java.text.DecimalFormat;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MySolution3 {

	public static void main(String[] args) {
		
		CreditCard card1 = new KakaoVIP("민재");
		
		int result = card1.upLimit(1000000);
		limitResult(result);
		System.out.println(card1);
		
		result = card1.upLimit(1100000);
		limitResult(result);
		System.out.println(card1);
		
		result = card1.pay(40000);
		payResult(result);
		System.out.println(card1);
		
		result = card1.pay(2000000);
		payResult(result);
		System.out.println(card1);
		
		
	}

	public static void limitResult(int result) {

		System.out.println(".....이용한도 금액 처리 결과 입니다. .....");

		if (result==0)
			System.out.println("카카오 미니 카드 최대 한도 금액을 초과하여 변경할 수 없습니다.");

		else {
			DecimalFormat df = new DecimalFormat("##,###원");
			String temp =df.format(result);
			System.out.println("한도 금액 " + temp + "원 올렸습니다.");
		}
	}
	
	public static void payResult(int result) {
		
		System.out.println(".....결제 금액 카드 사용 처리 결과 입니다. .....");
		
		if (result==0)
			System.out.println("이용한도 금액이 초과되었습니다.");

		else {
			DecimalFormat df = new DecimalFormat("##,###원");
			String temp =df.format(result);
			System.out.println("결제 금액 " + temp + "원 사용되었습니다.");
		}
	}
}
