package ex21_3_insert_delete_update;
//데이터베이스의 데이블에 데이터를 추가하는 프로그램
//executeUpdate 메서드 사용
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample4_Oracle_insert_input2 {

	public static void main(String[] args) {
		//"A2000" "모니터" 200 "삼성"
		if (args.length != 4) {
			System.out.println(
					"상품코드 상품명 가격 제조사를 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();

			/*
			 INSERT, UPDATE, DELETE 문을 실행하는 메서드는 executeUpdate()입니다.
			 executeUpdate()의 리턴값은  INSERT, UPDATE, DELETE 수행 된 row의 수입니다.
			 */
			
			/*
			 1. 직접 데이터를 입력하는 경우
			 insert info goodsinfo
			 values('A1000', '고급 핸드폰', 100, 'LG')
			 
			 2. 변수를 이용해서 입력하는 경우
			  insert info goodsinfo (code, name, price, maker)
			  values( 'args[0]의 값' , 'args[1]의 값' , args[2]의 값 , 'args[3]의 값')
			 */
			String sql = "insert into goodsinfo "
					+ "(code, name, price, maker) "
					+ "values"
					+ "('" + args[0] + "', " //varchar2 자료형
					+ "'"  + args[1] + "', "
					+ 		 args[2] + ", '"
					+		 args[3] + "')";
			
			System.out.println(sql + "\n");
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "행이 추가되었습니다.");
			
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
