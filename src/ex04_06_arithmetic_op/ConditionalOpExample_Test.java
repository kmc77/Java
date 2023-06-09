package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class ConditionalOpExample_Test {

	public static void main(String[] args) {
		InputStream is = System.in;

		Scanner sc = new Scanner(is);

		System.out.print("3개의 정수를 입력 하세요?>");
		int a, b, c, max, min;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// 최댓값을 구하는 중첩 삼항자
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		System.out.println("max = " + max);
		System.out.printf("%d, %d, %d 중 가장 큰 수는  = %d\n", a, b, c, max);

		// 최솟값을 구하는 중첩 삼항자
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		System.out.println("min = " + min);
		System.out.printf("%d, %d, %d 중 가장 작은 수는  = %d", a, b, c, min);
		
		
		sc.close();
	}

}
