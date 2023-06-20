package ex23_Board;

import java.util.List;
import java.util.Scanner;

public class Board_main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
				
			case 2:
				update(sc, dao);
				break;	
			
			case 5:
				selectAll(dao);
				break;
			
			case 7:
				sc.close();
				return;
			}
		} while (true);
	}
	
	private static void printTitle() {
		System.out.printf("%s\t%s\t\t%s\t\t\t%s\t\t\t%s\t%s\t%s\t%s\n",
						"글번호", "작성자", "제목", "내용", "ref", "lev", "seq",	 "date");
	}

	private static void selectAll(BoardDAO_seq dao) {
		// 1- 페이지(page)
		// 10 - 페이지 당 목록의 수 (limit)
		List<Board> list = dao.getBoardList(1, 10);
		if (list.isEmpty()) {
			System.out.println("테이블에 데이터가 없습니다.");

		} else {
			printTitle();
			for (Board s : list) {
				System.out.println(s.toString());
			}
		}
	}

	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();
		System.out.print("작성자>");
		board.setBOARD_NAME(sc.nextLine());

		System.out.print("비밀번호>");
		board.setBOARD_PASS(sc.nextLine());

		System.out.print("제목>");
		board.setBOARD_SUBJECT(sc.nextLine());

		System.out.print("글 내용>");
		board.setBOARD_CONTENT(sc.nextLine());

		if (dao.boardInsert(board) == 1)
			System.out.println("글이 작성되었습니다.");
		else {
			System.out.println("오류가 발생되었습니다.");
		}
	}

	private static void update(Scanner sc, BoardDAO_seq dao) {
		System.out.print("수정할 번호를 입력하세요>");
		int num = inputNumber(sc);
		Board board = select(dao, num);
		if (board != null) {
			System.out.println("제목>");
			board.setBOARD_SUBJECT(sc.nextLine());
			
			System.out.println("글 내용>");
			board.setBOARD_CONTENT(sc.nextLine());
			
			System.out.println("비밀번호>");
			String pass = sc.nextLine();

			// 지금 입력한 비밀번호와 DB에 저장된 비밀번호 비교하기
			if (pass.equals(board.getBOARD_PASS())) {
				int result = dao.boardModify(board);
				if (result == 1) {
					System.out.println("수정에 성공했습니다.");
				} else {
					System.out.println("수정에 실패했습니다.");
				}
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
	}
	
	private static int menuselect(Scanner sc) {
		String menus[] = { "글쓰기", "수정", "답변달기", "글삭제", "조회", "페이지 선정", "종료" };
		int i = 0;
		System.out.println("===========================================================");
		for (String menu : menus) {
			System.out.println(++i + "." + menu);
		}
		System.out.println("===========================================================");
		System.out.print("메뉴를 선택하세요>");
		return inputNumber(sc, 1, menus.length);
	}

	private static int inputNumber(Scanner sc, int start, int end) {
		int input = 0;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= end && input >= start || start == 0 && end == 0) {
					break;
				} else {
					System.out.print(start + "~" + end + "사이의 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	}

	private static int inputNumber(Scanner sc) {
		return inputNumber(sc, 0, 0);
	}

	private static Board select(BoardDAO_seq dao, int num) {
		Board board = dao.getDetail(num);
		if (board != null) {
			printTitle();
			System.out.println(board.toString());
		} else {
			System.out.println("해당 글이 존재하지 않습니다.");
		}
		return board; // 수정, 삭제시에는 비밀번호 확인을 위해 필요
						// 답변의 경우 원문글 (선택한 글) 의 BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ 값이 필요

	}

}
