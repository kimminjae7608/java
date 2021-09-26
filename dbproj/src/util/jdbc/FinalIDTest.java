package util.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import vo.CustomVo;

public class FinalIDTest {

	private static PreparedStatement pstmt = null;
	private static Connection conn = null;
	private static String sql = null;
	public static void main(String[] args) {
		//final id 가입하기(중복x)
		String id = null,name,email;
		int age;
		boolean result = true;
		
		Scanner sc = new Scanner(System.in);
		conn = OracleConnectionUtil.connect();
		
		sql = "INSERT INTO CUSTOM#(custom_id,name,email,age) " + "VALUES(?,?,?,?)";
		
		System.out.println("새로운 사용자 등록합니다.");
		while(result) {
			System.out.print("id 입력 >>>");
			id = sc.nextLine();
			result = idcheck(id);
			System.out.print("id확인중입니다....");
			if(result) {
				System.out.println("사용중인 아이디 입니다.");
				System.out.println("다시 id를 만드세요.");
			}
			else
				System.out.println("사용가능합니다. 스마일");
		}
		System.out.print("이름 입력 >>>");
		name=sc.nextLine();
		System.out.print("이메일 입력 >>>");
		email=sc.nextLine();
		System.out.print("나이 입력 >>>");
		age=sc.nextInt();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id);	
			pstmt.setNString(2, name);
			pstmt.setNString(3, email);
			pstmt.setInt(4, age);
			
			pstmt.execute();
			
			System.out.println("환영합니다.!!");
			//입력된 정보 출력하기
			
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL문장 확인하세요! : "+ e.getMessage());
		} finally {
			OracleConnectionUtil.close(conn);
		}
		

	}

	
	//ID 중복체크하는 메소드 private (?) idcheck(String id) -> true, false 리턴합니다.
	
	private static boolean idcheck(String id) {
		ResultSet rs = null;
		CustomVo vo = null;
		boolean result = false;
		conn= OracleConnectionUtil.connect();
		sql ="SELECT * FROM CUSTOM# WHERE CUSTOM_ID =?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(id)) {
					result = true;
				}
			}
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn);
		}
		return result;
	}
	
}
