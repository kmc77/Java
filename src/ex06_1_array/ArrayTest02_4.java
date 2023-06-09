package ex06_1_array;

import java.util.Scanner;

public class ArrayTest02_4 {

	public static void main(String[] args) {

		int a, b, c, d, e, max, min;
		int data[] = new int[5];

		System.out.print("데이터 입력?");
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		// 최댓값을 구하는 중첩 삼항자
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		max = (max > d) ? max : d;
		max = (max > e) ? max : e;
		System.out.println("max = " + max);

		// 최소값을 구하는 중첩 삼항자
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		min = (min < d) ? min : d;
		min = (min < e) ? min : e;
		System.out.println("min = " + min);
		
		sc.close();

	}
		
}
