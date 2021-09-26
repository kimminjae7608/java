package jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.jdbc.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {
		// OracleConnectionUtil 클래스로 db연결을 시도해 봅니다.

		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);	//출력값이 null이면 db연결이 안된 상태입니다.		
				
		//실행할 sql 문 : 지금방법은 매우 기본적이고 원초적인 방법-> 좀더 쉽게 sql 실행 코딩을 할 수 있도록 발전되어집니다.
		String sql = "INSERT INTO custom#(custom_id,name,email,age) " +
//		"VALUES('sana1000', '박사나', 'sana@korea.com', 29)";	//1) 변수 처리 할 예정입니다. (데이터를 직접작성)
			"VALUES(?,?,?,?)";	//2) 변수 처리(문자열,문자열,문자열,정수) 준비
		//CUSTOM_ID : 무결성 PK 제약조건 검사합니다. -> 중복된값X, null X
		//
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);	//실행할 sql 전달 -> connect객체로 실행
			
			//2)번으로 할때 ?에 해당하는 값을 sql 전달후에 설정.->pstmt 객체 메소드로 합니다.
			pstmt.setString(1, "kangnana");	//전달할 값의 인덱스 1 (0번부터 아닙니다.)
			pstmt.setString(2, "강나나");
			pstmt.setString(3, "lee@naver.com");
			pstmt.setInt(4, 28);			//sql을 먼저 전다 -> 필요한 데이터는 그 후에설정이 됩니다.
			
			
			pstmt.execute();		//sql 실행. -> PreparedStatement 객체로 실행합니다.
			pstmt.close();			//pstmt 사용종료
			System.out.println("insert 정상완료!!");
		} catch (SQLException e) {
			System.out.println("SQL실행에 오류가 발생했습니다. : "+e.getMessage());
//			e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn);	//연결종료
		}

	}
}
