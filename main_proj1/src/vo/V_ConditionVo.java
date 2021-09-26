package vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

// v_condition 테이블의 컬럼들과 매핑되는 클래스
public class V_ConditionVo {
	private String u_id;	//아이디
	private int s_num;	//연번
	private String vaccin;	//백신종류
	private String inoc_f;	//1차접종
	private String inoc_s;	//2차접종
	private Date inoc_date;	//접종날짜
}
