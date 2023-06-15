package ex21_3_insert_delete_update;
//데이터베이스의 데이블에 데이터를 삭제하는 프로그램

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample5_Oracle_delete {

	public static void main(String[] args) {
		
		
		if (args.length != 1) { //A2000
			System.out.println("상품코드를 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			String single = "'";
			
			String delete_sql	=" delete goodsinfo "
						+ " where code =" + single + args[0] + single;
			
			System.out.println(delete_sql);
			int rowNum = stmt.executeUpdate(delete_sql);
				System.out.println(rowNum + "행이 삭제 되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			
			if (stmt != null)
				try {
					stmt.close();
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
