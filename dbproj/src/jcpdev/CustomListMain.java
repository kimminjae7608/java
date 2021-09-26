package jcpdev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.jdbc.OracleConnectionUtil;
import vo.CustomVo;

//고객 리스트를 db에서 가져오기
public class CustomListMain {

	public static void main(String[] args) {
		List<CustomVo> list = custom_list();
		System.out.println("List 타입 toString() 실행 : " + list);
		
		for(CustomVo cv : list) {
			System.out.println(cv);
		}
	}
	
	private static List<CustomVo> custom_list(){
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt ;
		String sql = "SELECT * FROM Custom#";
		ResultSet rs=null;
		CustomVo cv;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			List<CustomVo> list = new ArrayList<>();
			while(rs.next()) {
				cv = new CustomVo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5));
				list.add(cv);	//리스트에 추가합니다.
				
			}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("product List 조회에 문제가 없습니다.");
			try {
				rs.close();
				OracleConnectionUtil.close(conn);
			} catch (SQLException e) {
				System.out.println("product List 조회에 문제가 있습니다."+e.getMessage());
				e.printStackTrace(); 	//오류를 추척하는데 좋은
			}
		}
		
		return null;
		//return list;	//마지막에 list를 리턴해도 된다.
	}
}
