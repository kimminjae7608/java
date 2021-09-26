package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.jdbc.OracleConnectionUtil;
import vo.V_ConditionVo;
import vo.V_UserVo;

public class V_UserDao {
	
	private static V_UserDao dao = new V_UserDao();
	
	public V_UserDao() {
	}
	
	public static V_UserDao getInstance() {
		return dao;
	}

	// user 회원가입
	public void insert(V_UserVo vo) {
		
		Connection conn = OracleConnectionUtil.connect();
		String sql = "INSERT INTO V_USER VALUES(?,?,?,?,?)";
		PreparedStatement pstmt =null;
		try {
			pstmt = conn.prepareStatement(sql);	
			
			pstmt.setString(1, vo.getU_id());	
			pstmt.setString(2, vo.getU_birth());
			pstmt.setString(3, vo.getU_gender());
			pstmt.setString(4, vo.getP_num());		
			pstmt.setString(5, vo.getU_nation());

			pstmt.execute();		
			
		} catch (SQLException e) {
			System.out.println("SQL실행에 오류가 발생했습니다. : "+e.getMessage());

		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			OracleConnectionUtil.close(conn);
		}
	}
	
	
	// U_ID 존재 여부 확인
	public boolean u_id_check(String u_id) { 
		Connection conn = OracleConnectionUtil.connect();
		String sql = "SELECT * FROM V_USER WHERE U_ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql); // sql 쿼리 전달
			pstmt.setString(1, u_id);
			rs = pstmt.executeQuery();
			if (rs.next()) { 
				return false; // 중복값이면 false 리턴
			} else
				return true;

		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
			// e.printStackTrace();
		} finally { // try 안에서 return 할때 finally 실행하고 리턴합니다.
					// 익셉션 발생하여 catch 실행하고 finally 실행.
			try {
				rs.close(); // 꼭 닫기
				pstmt.close(); // 꼭 닫기
				conn.close();
			} catch (SQLException e) {
				System.out.println("close 오류 : " + e.getMessage());
				// e.printStackTrace();
			}
		}

		return false;
	}
	//id로 회원정보 출력하기
	public V_UserVo getV_User(String id) { 
		Connection conn = OracleConnectionUtil.connect();

		String sql = "SELECT * FROM V_USER WHERE U_ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String u_id,u_birth,u_gender,p_num,u_nation;
		V_UserVo vo = null; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) { 
				u_id = rs.getString("U_ID");
				u_birth = rs.getString("U_BIRTH");
				u_gender = rs.getString("U_GENDER");
				p_num = rs.getString("P_NUM");
				u_nation = rs.getString("U_NATION");
				vo = new V_UserVo(u_id, u_birth, u_gender, p_num, u_nation); 
			}

		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
			// e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
			}
			OracleConnectionUtil.close(conn);
		}

		return vo;
	}
	
	//id와 생년월일로 로그인 가능여부 확인
	public boolean login_check(String u_id,String u_birth) { 
		Connection conn = OracleConnectionUtil.connect();
		String sql = "SELECT * FROM V_USER WHERE U_ID=? AND U_birth =?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql); // sql 쿼리 전달
			pstmt.setString(1, u_id);
			pstmt.setString(2, u_birth);
			rs = pstmt.executeQuery();
			if (rs.next()) { 
//				System.out.println("true----");
				return true; // 접속할려는 id,birth가 DB에 존재하면 true -> 로그인 성공
			} else {
//				System.out.println("false----");
				return false; // 로그인 실패
			}		
		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
		} finally {
			try {
				rs.close(); 
				pstmt.close(); 
			} catch (SQLException e) {
				System.out.println("close 오류 : " + e.getMessage());
			}
			OracleConnectionUtil.close(conn); 
		}

		return false;		//문제가 있을시 로그인 실패
	}
	
		   // user에서 ->phonenumber이용해서 id찾기
		   public String get_u_id(String p_num) {
		      Connection conn = OracleConnectionUtil.connect();
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;

		      String sql = "SELECT U_ID FROM V_USER WHERE P_NUM = ?";// *모든테이블을 의미
		      try {
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setNString(1, p_num);
		         rs = pstmt.executeQuery();
		         String id = null;//->return값으로 id를 받으려고 하니까 String

		         if (rs.next()) {
		               id = rs.getString("u_id");
		               return id;

		         }
		      } catch (SQLException e) {
		         System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
		      } finally {
		         try {
		            rs.close();
		            pstmt.close();
		            conn.close();
		         } catch (SQLException e) {
		         }
		         OracleConnectionUtil.close(conn);
		      }
		      return null;
	 }
}
