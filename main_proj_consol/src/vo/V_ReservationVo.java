package vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class V_ReservationVo {
	private String u_id;
	private int s_num;
	private String vaccine;
	private Date inoc_date;
	private String u_nation;
	
	@Override
	public String toString() {
		return "사용자 id : " + u_id+" | 병원코드 : "+ s_num +" | 백신종류 : "+vaccine+
					" | 접종 날짜 : "+inoc_date+" | 국적 : "+u_nation;
		}
}
