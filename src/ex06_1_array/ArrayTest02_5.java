package ex06_1_array;

import java.util.Scanner;

public class ArrayTest02_5 {

	public static void main(String[] args) {

		int[] data = new int[5];
		System.out.print("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);

		data[0] = sc.nextInt();
		int max = data[0];
		int min = data[0];

		// 최댓값과 최솟값을 구하는 중첩 삼항자
		for (int i = 1; i < data.length; i++) {
			data[i] = sc.nextInt();
			if (max < data[i])
				max = data[i];
			if (min > data[i])
				min = data[i];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

		sc.close();

	}
}
