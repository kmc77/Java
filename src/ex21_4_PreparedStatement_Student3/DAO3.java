//PreparedStatement 사용예 - 삽입과 수정을 서브쿼리문을 이용
//insert와 delete를 Student3로 처리
package ex21_4_PreparedStatement_Student3;

import java.sql.*;
import java.util.ArrayList;

public class DAO3 {

	public int insert(Student3 student3) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		StringBuilder sql = new StringBuilder();
		sql.append("insert into student(no, name, kor, math, eng, tot, avg, grade) ");
		sql.append("values(student_seq.nextval, ?, ?, ?, ?, ?, ?, "
				+ "(select grade from hakjum where ? between lowscore and hiscore)" 
				+ ")");

		int result = 0;
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			// 입력 매개변수의 타입이 문자열이면 setString()을 호출
			pstmt.setString(1, student3.getName());

			pstmt.setInt(2, student3.getKor());
			pstmt.setInt(3, student3.getMath());
			pstmt.setInt(4, student3.getEng());
			pstmt.setInt(5, student3.getTot());
			pstmt.setFloat(6, student3.getAvg());
			pstmt.setFloat(7, student3.getAvg());

			// 쿼리 실행
			result = pstmt.executeUpdate();
			System.out.println("db에 반영됨 . . . . . .");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
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
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
		}
		return result;
	}
	
	
	public ArrayList<Student3> selectAll() {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();
		sql.append("select * from student order by no");
		
		ArrayList<Student3> arrst = new ArrayList<Student3>();
		try {

			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			// 쿼리 실행
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Student3 st = new Student3();
				st.setNo(rs.getInt("no"));
				st.setName(rs.getString("name"));
				st.setKor(rs.getInt("kor"));
				st.setMath(rs.getInt("math"));
				st.setEng(rs.getInt("eng"));
				st.setTot(rs.getInt("tot"));
				st.setAvg(rs.getFloat("avg"));
				st.setGrade(rs.getString("grade"));
				arrst.add(st);
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
					conn.close(); //4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}

		return arrst;
	}

	public Student3 select(int no) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();
		sql.append("select * from student where no = ?");
		
		Student3 st = null;
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, no);

			// 쿼리 실행
			rs = pstmt.executeQuery();
			if (rs.next()) {
				st = new Student3();
				st.setNo(rs.getInt("no"));
				st.setName(rs.getString("name"));
				st.setKor(rs.getInt("kor"));
				st.setMath(rs.getInt("math"));
				st.setEng(rs.getInt("eng"));
				st.setTot(rs.getInt("tot"));
				st.setAvg(rs.getFloat("avg"));
				st.setGrade(rs.getString("grade"));
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
					conn.close(); //4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}

		return st;
	}

	

	public int delete(int no) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		StringBuilder sql = new StringBuilder();
		sql.append("delete from student where no= ? ");
		int result = -1;
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, no);

			// 쿼리 실행
			result = pstmt.executeUpdate();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (pstmt != null)
				try {
						pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close(); //4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}

		return result;
	}

	public int update(Student3 student3) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		StringBuilder sql = new StringBuilder();
		sql.append("update student set name= ?, kor = ?, math = ?, eng = ? , tot =?, avg = ?,"
				+ " grade =(select grade from hakjum where ? between lowscore and hiscore) " 
				+ " where no= ? ");
		int result = -1;
		try {
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, student3.getName());
			pstmt.setInt(2, student3.getKor());
			pstmt.setInt(3, student3.getMath());
			pstmt.setInt(4, student3.getEng());
			pstmt.setInt(5, student3.getTot());
			pstmt.setFloat(6, student3.getAvg());
			pstmt.setFloat(7, student3.getAvg());
			pstmt.setInt(8, student3.getNo());

			// 쿼리 실행
			result = pstmt.executeUpdate();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println(se.getMessage());
		} finally {
			if (pstmt != null)
				try {
						pstmt.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close(); //4단계 : DB연결을 끊는다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}

		return result;
	}

}
