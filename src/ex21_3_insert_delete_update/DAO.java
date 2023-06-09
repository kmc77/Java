package ex21_3_insert_delete_update;

/*
 DAO(Data Access Object) 클래스
 - 데이터 베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스 입니다.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO {

	public List<Map<String, Object>> select() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			stmt = conn.createStatement();

//			String select_sql = "select dname, ename, deptno, sal "
//								+ "from emp natural join dept";
			String select_sql = "select dname, ename, emp.deptno, sal "
								+ "from emp , dept "
								+ "where emp.deptno=dept.deptno";

			rs = stmt.executeQuery(select_sql);

			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복
				Map<String, Object> h = new HashMap<String, Object>();

				// getString("dname") : 컬럼 dname 값을 string 형으로 리턴하는 메서드
				h.put("dname", rs.getString("dname"));
				h.put("ename", rs.getString("ename"));
				h.put("deptno", rs.getInt("deptno"));
				h.put("sal", rs.getInt("sal"));
				list.add(h);
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
		return list;
	}

}
