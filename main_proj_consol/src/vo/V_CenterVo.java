package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor

public class V_CenterVo {
	private int s_num;
	private String c_name;
	private String c_address;
	private String c_num;
	private String vaccine;
	private int v_count;
	
@Override
public String toString() {
	return "병원코드 : " + s_num+" | 시설명 : "+c_name+" | 주소 : "+c_address+
				" | 병원 전화번호 : "+c_num+" | 백신종류 : "+vaccine+" | 잔여백신 : "+v_count;
	}

}