package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.jdbc.OracleConnectionUtil;
import vo.V_ConditionVo;
import vo.V_ReservationVo;
import vo.V_UserVo;

public class V_ReservationDao {
	
	private static V_ReservationDao dao =new V_ReservationDao();
	public V_ReservationDao() {
		// TODO Auto-generated constructor stub
	}
	
	public static V_ReservationDao getInstance() {
		return dao;
	}
// 예약 입력하기
	public void insert(V_ReservationVo vo) {
		
		
		Connection conn = OracleConnectionUtil.connect();
		String sql = "INSERT INTO V_RESERVATION VALUES(?,?,?,?,?)";
		PreparedStatement pstmt =null;
		try {
			pstmt = conn.prepareStatement(sql);	
			
			pstmt.setString(1, vo.getU_id());	
			pstmt.setInt(2, vo.getS_num());
			pstmt.setString(3, vo.getVaccine());
			pstmt.setDate(4, vo.getInoc_date());		
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

	public boolean u_id_check(String u_id) { 
		Connection conn = OracleConnectionUtil.connect();
		String sql = "SELECT * FROM V_RESERVATION WHERE U_ID = ?";
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

	//예약 확인하기
	public V_ReservationVo getV_Reservation(String u_id) { 
		Connection conn = OracleConnectionUtil.connect();
	
		String sql = "SELECT * FROM V_RESERVATION WHERE U_ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String vaccine, u_nation;
		int s_num;
		Date inoc_date;
		V_ReservationVo vo = null; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_id);
			rs = pstmt.executeQuery();
	
			if (rs.next()) { 
				u_id = rs.getString("U_ID");
				s_num = rs.getInt("S_NUM");
				vaccine = rs.getString("VACCINE");
				inoc_date = rs.getDate("INOC_DATE");
				u_nation = rs.getString("U_NATION");
				vo = new V_ReservationVo(u_id, s_num, vaccine, inoc_date, u_nation); 
			}
	
		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
			// e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
			}
			OracleConnectionUtil.close(conn);
		}
	
		return vo;
	}
	
	
	public V_ReservationVo getV_Reservation(int s_num) { 
		Connection conn = OracleConnectionUtil.connect();
	
		String sql = "SELECT * FROM V_RESERVATION WHERE s_num = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String u_id,vaccine, u_nation;
		Date inoc_date;
		V_ReservationVo vo = null; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s_num);
			rs = pstmt.executeQuery();
	
			while (rs.next()) { 
				u_id = rs.getString("U_ID");
				s_num = rs.getInt("S_NUM");
				vaccine = rs.getString("VACCINE");
				inoc_date = rs.getDate("INOC_DATE");
				u_nation = rs.getString("U_NATION");
				vo = new V_ReservationVo(u_id, s_num, vaccine, inoc_date, u_nation); 
			}
	
		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
			// e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
			}
			OracleConnectionUtil.close(conn);
		}
	
		return vo;
	}
	
	//현재날짜가 예약날짜보다 빠르면 삭제기능
	public void delete(Date now_date) {
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		
		
		String sql ="DELETE FROM V_RESERVATION WHERE INOC_DATE < ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, now_date);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				OracleConnectionUtil.close(conn);
			}
		}
		
	}
	
	// 모든 예약자 id 조회
	public List<String> id_select() {
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		List<String> list = new ArrayList<String>();
		String sql ="SELECT U_id FROM V_RESERVATION";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
				list.add(rs.getString(1));	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				OracleConnectionUtil.close(conn);
			}
		}
		return list;
	}
	
	// 예약자 모든 정보 조회
		public List<V_ReservationVo> all_list() {
			Connection conn = OracleConnectionUtil.connect();
			PreparedStatement pstmt = null;
			ResultSet rs =null;
			List<V_ReservationVo> list = new ArrayList<>();
			String sql ="SELECT * FROM V_RESERVATION";
			
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				V_ReservationVo vo =null;
				
				while(rs.next()) {
					vo = new V_ReservationVo(rs.getString("U_ID"), rs.getInt("S_NUM"), 
							rs.getString("VACCINE"), rs.getDate("INOC_DATE"),
								rs.getString("U_NATION")); 
					list.add(vo);
					}
				return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					OracleConnectionUtil.close(conn);
				}
			}
			return list;
		}
		// 백신 예약 수정하기.
		public void update_inoc_date(Date u_date, String u_id) {
		      Connection conn = OracleConnectionUtil.connect();
		      String sql = "UPDATE V_RESERVATION SET INOC_DATE=? WHERE U_ID=?";
		      PreparedStatement pstmt = null;
		      try {
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setDate(1, u_date);
		         pstmt.setString(2, u_id);
		         pstmt.execute();
		         pstmt.close();
		      } catch (SQLException e) {
		         System.out.println("예약 수정이 완료되지않았습니다. : " + e.getMessage());
		         // e.printStackTrace();
		      } finally {
		         try {
		            pstmt.close();
		         } catch (SQLException e) {
		         }
		         OracleConnectionUtil.close(conn);
		      }
		}
}