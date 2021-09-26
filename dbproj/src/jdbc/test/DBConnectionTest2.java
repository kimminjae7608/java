package jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import util.jdbc.OracleConnectionUtil;

//연습 : Scannner 클래스 id, name, email, age 사용자 입력읇 받고 테이블에 insert 합니다.
public class DBConnectionTest2 {

	public static void main(String[] args) {
		// OracleConnectionUtil 클래스로 db연결을 시도해 봅니다.

		String id,name,email;
		int  age;
		
		Scanner sc= new Scanner(System.in);
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);	//출력값이 null이면 db연결이 안된 상태입니다.		
				
		String sql = "INSERT INTO custom#(custom_id,name,email,age) " + "VALUES(?,?,?,?)";	
		
		System.out.println("새로운 사용자 등록합니다.");
		
		System.out.print("id 입력 >>>");
		id=sc.nextLine();
		System.out.print("이름 입력 >>>");
		name=sc.nextLine();
		System.out.print("이메일 입력 >>>");
		email=sc.nextLine();
		System.out.print("나이 입력 >>>");
		age=sc.nextInt();
		//CUSTOM_ID : 무결성 PK 제약조건 검사합니다. -> 중복된값X, null X
		//
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);	//실행할 sql 전달 -> connect객체로 실행
			
			pstmt.setNString(1, id);	
			pstmt.setNString(2, name);
			pstmt.setNString(3, email);
			pstmt.setInt(4, age);			//sql을 먼저 전달 -> 필요한 데이터는 그 후에설정이 됩니다.
			
			
			pstmt.execute();		//insert,update,delete SQL 문 실행할때는 execute() 메소드입니다.
									//sql 실행. -> PreparedStatement 객체로 실행합니다.
			
			System.out.println("환영합니다.!!");
			pstmt.close();			//pstmt 사용종료
			
			
		} catch (SQLException e) {
			System.out.println("SQL실행에 오류가 발생했습니다. : "+e.getMessage());
//			e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn);	//연결종료
		}

	}
}
