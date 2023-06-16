package ex21_4_5_PreparedStatement;

//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
import java.sql.*;

public class JDBCExample6_Oracle_update {
	//코드 10001의 제조사를 HTA로 변경해 보세요
	//"10001" "HTA"
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("상품코드, 제조사 입력하세요");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			String up_sql	= "update goodsinfo "
						+ "set maker = ? "
						+ "where code = ? "; 

			pstmt = conn.prepareStatement(up_sql);
			pstmt.setString(1, args[1]); //"HTA"
			pstmt.setString(2, args[0]); //"10001"
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 수정 되었습니다.");
			
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
