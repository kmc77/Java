package ex21_4_2_statement_Search;
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
import ex21_4_select_statement_Test.Emp;

public class DAO {

	public ArrayList<Emp> search(int col_index, String search_word) {
		 ArrayList<Emp> list = new ArrayList<Emp>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String column_name[] = {"empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"};
		String sql = "select * from emp";
		
		if (col_index != 8) { //8은 종료를 의미
			
			String single = "";
			
			//ename, job, hiredate 는 ' 필요
			if (col_index == 1 || col_index == 2 || col_index == 4)
				single = "'";
			
			sql = sql + " where " + column_name[col_index] + "=" + single + search_word + single;
		}
		
		System.out.println("\n" + sql.toString() + "\n");
		
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			
			
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복

				Emp st = new Emp();
				st.setEmpno(rs.getInt(1)); //조회 결과 첫번째 컬럼 값을 가져옵니다.
											//SQL의 결과 null인 경우 0을 리턴
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

