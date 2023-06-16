package ex21_4_5_PreparedStatement;

//데이터베이스의 테이블에 데이터를 삭제하는 프로그램
import java.sql.*;

public class JDBCExample5_Oracle_delete {
	//"A5000"
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("상품코드 입력하세요");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			String del_sql
			= "delete from goodsinfo "
			+ "where code = ? ";
			pstmt = conn.prepareStatement(del_sql);
			pstmt.setString(1, args[0]); //"A5000"
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 삭제 되었습니다.");
			
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
