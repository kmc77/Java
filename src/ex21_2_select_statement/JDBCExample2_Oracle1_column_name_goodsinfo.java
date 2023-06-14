package ex21_2_select_statement;
//데이터베이스의 테이블 내용을 읽는 프로그램
//컬럼명으로 읽어 오는 경우
import java.sql.*;

class JDBCExample2_Oracle1_column_name_goodsinfo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			/*
			 데이터 베이스에 있는 테이블의 데이터를 읽어어기 위해 Statement 객체가 필요 합니다.
			 2단계에서 얻은 Connection 객체에 대해 createStatement 메서드를 호출해서 얻습니다.
			 */
			stmt = conn.createStatement();
			
			/*
			 Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로 
			 select 문을 실행하는 executeQuery라는 메서드가 있습니다.
			 이 메서드에 파라미터로 select 문장을 넘겨주어야 합니다.
			 이 메서드는 파라미터로 넘겨준 select 문을 데이터 베이스로
			 보내서 실행하고 그 결과로 ResultSet 객체를 리턴합니다.
			 */
			String select_sql = "select code, name, price, maker from goodsinfo";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("번호\t상품코드\t상품명\t\t가격\t제조사");
			System.out.println("--------------------------------------------------");
			
			int i = 0;
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복

				String code = rs.getString("code");
				String name = rs.getString("name");

				// getInt("price") : 컬럼 price 값을 int 형으로 리턴하는 메서드
				int price = rs.getInt("price");
				String maker = rs.getString("maker");

				System.out.printf(
						"%d\t%-7s\t%-10s\t%d\t%-5s\n",
						i++, code, name, price, maker);
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
			if (stmt != null)
				try {
					stmt.close();
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
