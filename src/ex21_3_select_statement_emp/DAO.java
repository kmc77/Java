package ex21_3_select_statement_emp;
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
import java.util.List;

public class DAO {

	public List<Emp> selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> list = new ArrayList<Emp>();
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
			String select_sql = "select * from emp";
			
			rs = stmt.executeQuery(select_sql);
			
			
			
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복

				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));
				st.setEname(rs.getString(2));
				st.setJob(rs.getString(3));
				st.setMgr(rs.getInt(4));
				st.setHiredate(rs.getDate(5));
				st.setSal(rs.getInt(6));
				st.setComm(rs.getInt(7));
				st.setDeptno(rs.getInt(8));
				list.add(st);
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
