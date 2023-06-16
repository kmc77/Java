package ex21_4_5_PreparedStatement;

//데이터베이스의 테이블 내용을 읽는 프로그램

import java.sql.*;

public class JDBCExample2_Oracle1_column_name_dept {

	public static void main(String[] args) {
		Connection conn = null;
		
		/*
		 SQL문장이 미리 컴파일되고 실행시간 동안 인수값을 위한 공간을 확보할 수 있습니다.
		 즉, SQL쿼리의 틀을 미리 생성해 놓고 값을 나중에 지정합니다.
		 실행 전에 ?(위치폴더 - placeholder)가 값으로 바뀝니다.
		 */
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			String select_sql = "select * from dept";

			//PrepareStatement 객체 얻기
			pstmt = conn.prepareStatement(select_sql);
			rs = pstmt.executeQuery();

			System.out.println("번호\t부서번호\t부서명\t\t지역");
			System.out.println("--------------------------------------------------");

			/*
			 * ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메서드를 호출해야 합니다. rs.next() -
			 * 다음 행 위치로 이동하는 메서드 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복
				// getInt("deptno") : 컬럼 deptno 값을 int 형으로 리턴하는 메서드
				int deptno = rs.getInt("deptno");

				// getString("dname") : 컬럼 dname 값을 String 형으로 리턴하는 메서드
				String dname = rs.getString("dname");

				String loc = rs.getString("loc");

				System.out.printf("%5d\t%5d\t%-15s%s\n", ++i, deptno, dname, loc);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close(); // 4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		} // finally

	}

}
