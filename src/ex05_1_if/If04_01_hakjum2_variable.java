package ex05_1_if;

import java.util.Scanner;

public class If04_01_hakjum2_variable {

	public static void main(String[] args) {
		System.out.print("정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		String grade = "F"; //else 값을 기본값으로 지정하면 if문 마지막 else를 뺄 수 있다.

		if (jumsu >= 90) {
			grade = "A";
		} else if (jumsu >= 80) {
			grade = "B";
		} else if (jumsu >= 70) {
			grade = "C";
		} else if (jumsu >= 60) {
			grade = "D";
		}

		System.out.println(grade + "학점");
		System.out.println("끝.");
		sc.close();

	}

}
