package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample2 {

	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.print("수를 입력 하세요~>");
		int n = sc.nextInt();

		if (n >= 1 && n <= 11) {
			System.out.println("1~10 사이의 수 입니다.");
		} else {
			System.out.println("1~10 사이의 수가 아닙니다.");
		}
		
		
		if (n == 1 || n == 11) {
			System.out.println("1 또는 11이 맞습니다.");
		} else {
			System.out.println("1 또는 11이 아닙니다.");
		}

		sc.close();
	}

}
