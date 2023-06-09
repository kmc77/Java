package ex12_3_Exception_test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");

		try {
			int number = sc.nextInt();
			System.out.println("입력한 데이터 : " + number);
		} catch (java.util.InputMismatchException e) {
			System.out.println("점수를 입력하세요");
		} finally {
			if (sc != null)
				sc.close();
		}

	}
}
