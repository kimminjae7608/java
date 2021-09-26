package builder;

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
@Builder			//Builder 패턴으로 객체를 생성할 수 있습니다.
//buy# 테이블과 매핑되는 클래스
public class Buy {
	private int buy_no;
	private String custom_id;
	private String pcode;
	private Date reg_date;
	
}
