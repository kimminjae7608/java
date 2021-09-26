package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.jdbc.OracleConnectionUtil;
import vo.ProductVo;

public class ProductDao {

	private static ProductDao dao = new ProductDao();
	private ProductDao() {

	}
	
	public static ProductDao getProductDao() {
		return dao;
	}
	
	//상품 전체 리스트 가져오기
	public List<ProductVo> getList(){
		String sql = "SELECT * FROM product#";	//다수의 row 결과
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt;
		ResultSet rs=null;
		ProductVo vo;
		List<ProductVo> list = new ArrayList<ProductVo>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	//select
			
			while(rs.next()) {
				// vo 클래스 객체와 조회 결과 각 컬럼을 매핑
				vo = new ProductVo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				list.add(vo);	//리스트에 추가합니다.
				
			}
			return list;
			
		} catch (SQLException e) {
			System.out.println("product List 조회에 문제가 있습니다." + e.getMessage());
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
	}
	
	//상품 카테고리 검색 리스트 -미완성 ->완성
	
	public List<ProductVo> getCategoryList(String category){
		String sql = "SELECT * FROM product# WHERE category=?";
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String pcode,pname;
		int price;
		ProductVo vo=null;
		List<ProductVo> list = new ArrayList<>();
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, category);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				pcode = rs.getString(1);
				category = rs.getString(2);
				pname = rs.getString(3);
				price = rs.getInt(4);
				vo = new ProductVo(pcode,category,pname,price);
				list.add(vo);
			}
			System.out.println(vo);
			
		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
			}
			OracleConnectionUtil.close(conn);
		}

		return list;
	}
	
}
