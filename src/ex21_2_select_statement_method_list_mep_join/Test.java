package ex21_2_select_statement_method_list_mep_join;

import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		DAO dao = new DAO();
		List<Map<String, Object>> list = dao.select();

		System.out.println("번호\t부서이름\t\t사원이름\t부서번호\t급여");
		System.out.println("--------------------------------------------------------");
		int no = 1;
		for (Map<String, Object> h : list) {
				System.out.println(no++ + "\t" + String.format("%-10s", h.get("dname"))
										+ "\t" + String.format("%-10s", h.get("ename"))
										+ h.get("deptno") + "\t" + h.get("sal"));	
			}
		}

	}