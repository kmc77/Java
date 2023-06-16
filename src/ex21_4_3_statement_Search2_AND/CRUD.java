package ex21_4_3_statement_Search2_AND;

import java.util.ArrayList;
import java.util.Scanner;

//import ex21_2_select_statement_method_list_map_alias.DAO;
//import ex21_4_select_statement_Test.Emp;

//조회할 컬럼 선택과 해당 컬럼 값 입력 후 조회 결과 출력하는 프로그램
public class CRUD {
	// CRUD:컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	// C(Create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

	public static void main(String[] args) {

		String[] search_word = menuselect();
		search(search_word);

	}

	private static String[] menuselect() {
		Scanner sc = new Scanner(System.in);
		String search[] = new String[8];
		int i = 0;
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}

		int menu = 0;
		do {
			System.out.print("조회할 컬럼을 선택하세요>");
			menu = inputNumber(sc);
			if (menu == 9) {
				sc.close();
				break;
			}
			search[menu - 1] = searchData(sc, menu);

		} while (true);

		return search;
	}

	private static String searchData(Scanner sc, int menu) {
		System.out.println("조회할 " + menus[menu - 1] + "를(을) 입력하세요>");
		return sc.nextLine();
	}

	private static void search(String[] searchword) {
		DAO dao = new DAO();
		ArrayList<Emp> list = dao.search(searchword);

		if (list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0], menus[1], menus[2], menus[3],
					menus[4], menus[5], menus[6], menus[7]);
			for (Emp s : list) {
				System.out.println(s.toString());
			}
		}
	}
	private static int inputNumber(Scanner sc) {
		int input = 0;
		int lowNumber = 1;
		int hiNumber = 9;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= hiNumber && input >= lowNumber) {
					break;
				} else {
					System.out.print(lowNumber + "~" + hiNumber + "사이의 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	}

}