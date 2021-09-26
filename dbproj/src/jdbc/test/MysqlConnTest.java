package jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.jdbc.MySQLConnectionUtil;

public class MysqlConnTest {

	public static void main(String[] args) {

		Connection conn = MySQLConnectionUtil.connect();
		System.out.println("MySQL 서버와 연결시도합니다.");
		System.out.println(conn); //null 이 아니면 연결 성공
		//mysql insert 오류 : encoding -> table 인코딩 방식 확인
		String sql = "insert into BOOK (BCODE,TITLE,WRITER,PUBLISHER,CDATE) \r\n" + 
				"values ('A1108','HTML완성','김자바','코리아아이티','21/09/03')";
															//년도/월/일
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();
		} catch (SQLException e) {
			System.out.println("오류 메시지 : "+ e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		MySQLConnectionUtil.close(conn);
		
		
	}

}
