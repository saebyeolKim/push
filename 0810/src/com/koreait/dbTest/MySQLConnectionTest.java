package com.koreait.dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionTest {

	public static void main(String[] args) {
		
//		데이터베이스 작업에 사용할 객체를 선언한다.
		Connection conn = null;				// 데이터베이스와 연결한다.
		Statement stmt = null;				// 정적 쿼리를 실행한다. => 쿼리에 변수가 사용되지 않는 경우 => 간단한 sql 명령을 실행
		PreparedStatement pstmt = null;		// 동적 쿼리를 실행한다. => 쿼리에 변수가 사용되는 경우 => 복잡한 sql 명령을 실행
		ResultSet rs = null;				// select sql 명령의 실행 결과를 저장한다.
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			MySQL에 연결한다.
//			getConnection(url, user, password)
//			url에 사용할 MySQL이 설치된 경로와 사용할 데이터베이스 이름을 적는다.
//			localhost는 접속할 MySQL이 설피된 컴퓨터가 현재 사용중인 컴퓨터임을 의미하며 localhost 대신 127.0.0.1을 사용해도 된다.
//			3306 MySQL이 컴퓨터와 통신할 때 사용하는 포트 번호를 의미한다. => Oracle은 1521을 사용한다.
			String url = "jdbc:mysql://localhost:3306/javaam";
			conn = DriverManager.getConnection(url, "root", "0000");
//			사용한다.
			System.out.println("연결 성공: " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없거나 읽어올 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 정보가 올바르지 않습니다.");
		} finally {
//			데이터베이스 작업이 완료되면 사용한 모든 객체를 닫는다.
			if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if (stmt != null) {try {stmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
	}
}
