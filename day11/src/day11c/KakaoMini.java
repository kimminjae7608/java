package day11c;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard{
	//작성자 : 김민재
	private static final int MAX_LIMIT = 100000;
	
	public KakaoMini(String owner) {
		super(owner);
	}
	@Override
	public int upLimit(int limit) {
		if(this.limit+limit>MAX_LIMIT)
			return 0;
		else {
			this.limit+=limit;
			return this.limit;
		}
	}
	@Override
	public int pay(int payTotal) {
		if(this.payTotal+payTotal>this.limit)
			return 0;
		else {
			 this.payTotal+=payTotal;
			 return this.payTotal;
		}
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###원");	//정수 또는 실수에 출력패턴을 설정합니다.
		String temp =df.format(limit); //정수값 limit를 long으로 변환해서 패턴을 적용하고 문자열로 리턴합니다.
		String temp1=df.format(this.payTotal);
		return this.owner +" 님. 이번 달 결제 예정 금액 "+temp1+"원 입니다. [이용한도 " +temp+"]";
	}
}
