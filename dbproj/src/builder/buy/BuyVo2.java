package builder.buy;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
//buy# 테이블과 매핑되는 클래스
public class BuyVo2 {	//BuyVo 에서 builder 패턴추가
	private int buy_no;
	private String custom_id;
	private String pcode;
	private int quantity;
	private Date buy_date;
	private Date del_date;
}
