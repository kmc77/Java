package ex21_4_5_PreparedStatement;

//PreParedStatement
/*
 	1. PreParedStatement의 부모는 Statement입니다
 	
 	2. SQL 문장은 실행을 위해서는 컴파일이 필요한데 PreParedStatement는 사전에 컴파일을 합니다.
 	에)pstmt = conn.PreParedStatement(sql);
 	
 	3. PreParedStatement는 SQL문장이 미리 컴파일이 되기 떄문에 조건문이 바뀌지 않고
 		조건값만 바뀌는 경우, 삽입할 데이터만 바뀌는 경우 등에 사용하면 좋습니다.
 		즉, 한 번 미리 컴파일을 해두면 같은 쿼리에 대해서 컴파일은 하지 않고 값만 설정해서 수행합니다.
 		Statement는 같은 쿼리라고 해도 매번 컴파일 과정을 거칩니다.
 		따라서 같은 쿼리를 실행하더라도 PreParedStatement가 Statement보다 실행속도가 빠릅니다.
 		
 				예) insert into test(no, ename) values(1, '홍길동');
 				예) insert into test(no, ename) values(2, '홍길동');
 				예) insert into test(no, ename) values(3, '홍길동');
  
  	4. 3번을 적용하기 위해서 쿼리는 다음과 같이 변경합니다.
  		바뀌는 값에 대해서 ?(위치홀더 - placeholder, 입력매개변수)로 표시합니다.
  		예) insert into test(no, ename) values(?, ?);
  		
  	5. ?에 대한 값을 설정하기 위해 set자료형() 메서드를 사용합니다.
  		예) 첫번째 ?의 조건값이 정수형 1인 경우 setInt(1, 1)
  		예) 두번째 ?의 조건값이 문자형 '홍길동'인 경우 setString(2, "홍길동")
  		Statement는 SQL문장에서 single quotation(') 이 필요한 경우 직접 작성해 주었지만
  		PreParedStatement는 자료형에 따라 알아서 single quotation(')를 처리해 줍니다.
  		 
 */
import java.sql.*;

public class JDBCExample_2_Oracle1_column_name_emp {

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
			String select_sql = "select * from emp";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("번호\t사원번호\t사원이름\t직급\t\t상사\t입사일\t\t급여\t커미션\t부서번호");
			System.out.println("--------------------------------------------------------------------------------------");
			
			/*
			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메서드를 호출해야 합니다.
			 rs.next() - 다음 행 위치로 이동하는 메서드
			 			 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복
				
				int empno = rs.getInt("empno"); //the column value; if the value is SQL NULL,
												//the balue returned is 0
				String ename = rs.getString("ename"); //the column balue; if the value is SQL NULL,
														//the value returned is null
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				
				//java.sql.Date hiredate = rs.getDate("hiredate");
				String hiredate = rs.getString("hiredate").substring(0,10);
				//java.util.Date hiredate = rs.getDate("hiredate");

				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				System.out.printf(
						"%3d\t%5d\t%-8s%-10s\t%-5d\t%-15s%7d%7d%5d\n",
						++i, empno, ename, job, mgr, hiredate, sal, comm, deptno);
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
