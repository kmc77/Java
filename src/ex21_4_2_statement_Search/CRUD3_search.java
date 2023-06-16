package ex21_4_2_statement_Search;

import java.util.ArrayList;
import java.util.Scanner;

import ex21_3_select_statement_emp.Emp;

//조회할 컬럼 값을 여러개 입력 후 조회하는 프로그램
//end 조건으로 처리
public class CRUD3_search {
		// CRUD:컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
		// C(Create-insert), R(Read-select)
		// U(Update-update), D(Delete-delete)
		static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int menu = menuselect(sc);
			String search_word = input(menu, sc);
			search(menu, search_word);
			sc.close();
			
		}
		
		private static void search(int menu, String search_word) {
			DAO dao = new DAO();
			ArrayList<Emp> list = dao.search(menu -1, search_word);
			
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

		private static int menuselect(Scanner sc) {
			int i = 0;
			for (String m : menus) {
				System.out.println(++i + "." + m);
			}
			
			System.out.print("조회할 컬럼을 선택하세요>");
			return inputNumber(sc);
		}
		
		
		private static String input(int menu, Scanner sc) {
			String search_word = "";
			if (menu != 9)
				search_word = searchData(sc, menu);
			return search_word;
		}
		
		private static String searchData(Scanner sc, int menu) {
			System.out.println("조회할 " + menus[menu -1] + "를(을) 입력하세요>");
			return sc.next();
		}

		private static int inputNumber(Scanner sc) {
			int input = 0;
			int lowNumber = 1;
			int hiNumber = menus.length; // 9
			while (true)
				try {
					input = Integer.parseInt(sc.nextLine());
					if (input <= hiNumber && input >= lowNumber) {
						break;
					} else {
						System.out.println(lowNumber + "~" + hiNumber + "사이의 숫자를 입력하세요>");
					}
				} catch (NumberFormatException e) {
					System.out.print("숫자로 입력하세요>");
				}
			return input;
		}

	}
