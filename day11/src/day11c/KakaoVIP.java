package day11c;

import java.text.DecimalFormat;

public class KakaoVIP extends CreditCard{
private static final int PLUS_LIMIT = 1000000;
	
	public KakaoVIP(String owner) {
		super(owner);
	}
	@Override
	public int upLimit(int plus) {
		
		if(plus<=PLUS_LIMIT) {
			this.limit+=plus;
				return PLUS_LIMIT;
		}
		else {
			plus =PLUS_LIMIT;
			return this.limit+=plus;
		}
	}
	@Override
	public int pay(int money) {
		if(this.payTotal+money>this.limit)
			return 0;
		else {
			 this.payTotal+=money;
			 return money;
		}
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,###원");	//정수 또는 실수에 출력패턴을 설정합니다.
		String temp =df.format(limit); //정수값 limit를 long으로 변환해서 패턴을 적용하고 문자열로 리턴합니다.
		String temp1=df.format(this.payTotal);
		return this.owner +" 님. 이번 달 결제 예정 금액 "+temp1+"원 입니다. [이용한도 " +temp+"]";
	}
}
