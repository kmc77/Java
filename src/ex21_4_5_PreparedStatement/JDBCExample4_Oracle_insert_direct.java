package ex21_4_5_PreparedStatement;

//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
import java.sql.*;

public class JDBCExample4_Oracle_insert_direct {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			/*
			 1. 직접 데이터를 입력하는 경우
			 insert info goodsinfo
			 values('A5000', '키보드', 300, '손의나라')
			 */
			
			String sql	= "insert into goodsinfo "
						+ "values(?, ?, ?, ?)"; 
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A5000");
			pstmt.setString(2, "키보드");
			pstmt.setInt(3, 300);
			pstmt.setString(4, "손의나라");
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 추가되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		} // finally

	}

}
