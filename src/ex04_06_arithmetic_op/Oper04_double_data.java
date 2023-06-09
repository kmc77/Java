package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper04_double_data {

	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.print("실수를 입력 하세요>");
		double n = sc.nextDouble();

		if (n % 6 == 0) {
			System.out.println(n + "은(는) 6의 배수 입니다.");
		} else {
			System.out.println(n + "은(는) 6의 배수가 아닙니다.");
		}

		sc.close();
	}

}
