package jcpdev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.jdbc.OracleConnectionUtil;
import vo.ProductVo;

//product# 테이블의 상품목록(리스트)을 사용자에게 보여준다.
public class ProductListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductVo> list = product_list();
		System.out.println("List 타입 toString() 실행 : " + list);
		
		//빠른 for(foreach) - 상품목록 줄바꿈하여 출력하기
		for(ProductVo l : list) {
			System.out.println(l);
		}
		System.out.println();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}
	
	
	private static List<ProductVo> product_list(){
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt;
		ResultSet rs=null;
		String sql="SELECT * FROM product#";	// -> 실행예측 : row의 최대갯수는 많음.
		ProductVo vo;
		List<ProductVo> list = new ArrayList<ProductVo>();
		try {
			pstmt = conn.prepareStatement(sql);
			
			//select? 또는 insert? update? delete?
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// vo 클래스 객체와 조회 결과 각 컬럼을 매핑
				vo = new ProductVo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
//				System.out.println(vo); 	//test
				list.add(vo);	//리스트에 추가합니다.
				
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
			}
		}
		
		return null;
		//return list;	//마지막에 list를 리턴해도 된다.
	}

}
