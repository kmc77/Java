package ex21_4_5_PreparedStatement;

//처음 실행
import java.sql.*;

public class JDBCExample7_Oracle_transaction {
	
	public static void main(String[] args) {
		/*
		 	transaction : 논리적인 작업 단위
		 	insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로
		 	묶어서 쿼리 실행시 모든 작업이 정상 처리 된 경우에는 commit을 실행해서
		 	db에 반영하고 쿼리 실행 중 하나라도 정상처리 되지 않는 경우
		 	rollback을 실행해서 작업단위내의 모든 작업을 취소한다.
		 */
		
		// SQL문 작성하기
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into goodsinfo");
		sql1.append("values(?,?,?,?) ");

		StringBuilder sql2 = new StringBuilder();
		sql2.append("update goodsinfo ");
		sql2.append("set price = ? ");
		sql2.append("where code = ? ");

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			/////// transaction 시작 ////////
			// 하나의 논리적인 작업 단위 시작
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			// autoCommit기능 비활성화 시키기
			conn.setAutoCommit(false);

			// ------------1번 작업 시작-----------//
			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql1.toString());

			// 쿼리의 ?에 대체될 실제값 지정하기
			pstmt.setString(1, "10006");
			pstmt.setString(2, "공기청정기");
			pstmt.setInt(3, 500000);
			pstmt.setString(4, "코웨이");
			int result1 = pstmt.executeUpdate();
			pstmt.close();
			// ------------1번 작업 종료-----------//

			// ------------2번 작업 시작-----------//
			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql2.toString());

			// 쿼리의 ?에 대체될 실제값 지정하기
			pstmt.setInt(1, 100);
			pstmt.setString(2, "1000");
			int result2 = pstmt.executeUpdate();
			// ------------2번 작업 종료-----------//

			// 쿼리가 정상적으로 실행된 경우 db에 반영
			if (result1 == 1 && result2 == 1) {
				conn.commit();
				System.out.println("db에 반영됨 . . . . . .");
			} else {
				conn.rollback();
				System.out.println("db 반영이 취소됨 . . .");
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			try {
				System.out.println(se.getMessage());
				conn.rollback();
				System.out.println("db 반영이 취소됨 . . .");
			} catch (SQLException el) {
				el.printStackTrace();
				
			}
		} finally {
			if (pstmt != null)
				try {
					// Note:When a Statement object isclosed, its current ResultSet object,
					// if one exists, isalso closed.
					pstmt.close(); // Statement 객체가 닫히면 ResultSet 객체가 존재하는 경우 닫힙니다.
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			//////transaction 종료 /////
		}

	}

}
