package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class V_UserVo {
	private String u_id;
	private String u_birth;
	private String u_gender;
	private String p_num;
	private String u_nation;
	
	@Override
	public String toString() {
		return "사용자 id : "+u_id+" "
			+ "| 생년월일 : "+u_birth + " | "
				+ "성별 : "+u_gender+
				" | 핸드폰번호 : "+p_num+" | "
					+ "국적 : "+u_nation;
	}
}
