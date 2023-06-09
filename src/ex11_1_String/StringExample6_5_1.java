package ex11_1_String;

import java.util.Scanner;

//입력받은 주민번호 처리
/*
 출력결과)
 주민번호 입력:
 123456-3123456
 남자입니다.
 
 조건) Scanner 클래스의 nextLine()을 사용합니다.
 */
public class StringExample6_5_1 {

	public static void main(String[] args) {
		String sel = input();
		print(sel);

	}

	public static String input() {
		System.out.println("주민번호를 입력 : ");
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		s.close();
		return num.substring(7, 8);

	}

	public static void print(String sel) {
		switch (sel) {
		case "1":
		case "3":
			System.out.println("남자입니다.");
			break;

		case "2":
		case "4":
			System.out.println("여자입니다.");
			break;

		default:
			System.out.println("외국인입니다.");
		}
	}

}
