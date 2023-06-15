package ex21_4_2_statement_Search;

import java.util.Scanner;

public class CRUD {
		// CRUD:컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
		// C(Create-insert), R(Read-select)
		// U(Update-update), D(Delete-delete)
		static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int menu = menuselect(sc);
			System.out.println(menu);
			sc.close();
		}

		public static int menuselect(Scanner sc) {
			return 0;
		}

		
}