package jdbc.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.jdbc.OracleConnectionUtil;
import vo.CustomVo;

//sql 쿼리(조회, select 문) 실행을 테스트합니다. -> where 조건 추가 -> 조회 결과를 VO클래스와 매핑.
public class SelectWhereTest4 {

	public static void main(String[] args) {
		Connection conn= OracleConnectionUtil.connect();

		String sql ="SELECT * FROM CUSTOM# WHERE CUSTOM_ID =?";
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		String id =null;
		String name, email;
		int age;
		Date regdate;
		CustomVo vo=null;
		try {
			pstmt = conn.prepareStatement(sql);	//sql쿼리 전달
			pstmt.setString(1, "minjae");
			rs = pstmt.executeQuery();	
			
			if(rs.next()) {	//where 검색컬럼이 PK,unique일때 -> where x ,if 문으로
				//테이블 컬럼과 CustomVo 타입 객체와 매핑 -> 자동으로 할 때가 옵니다.
				id= rs.getString("CUSTOM_ID");
				name = rs.getString("NAME");
				email = rs.getString(3);
				age = rs.getInt("AGE");
				regdate = rs.getDate("REG_DATE");
				vo=new CustomVo(id,name,email,age,regdate);
			
			}
			
			System.out.println(vo);
			rs.close(); pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL실행에 오류가 발생했습니다. : "+e.getMessage());
//			e.printStackTrace();
		} finally {
	 		OracleConnectionUtil.close(conn);
	 	}
		if(vo== null) {
			System.out.println("조회할 사용자 id가 없습니다.");
		}else
			System.out.println("id = "+ id + "조회되었습니다.");
		System.out.println("id = " + id); //id=null 초기화하지 않으면 오류 생깁니다.
 	} 
}
