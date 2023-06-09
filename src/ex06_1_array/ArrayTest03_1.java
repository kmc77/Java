package ex06_1_array;

public class ArrayTest03_1 {

	public static void main(String[] args) {
		
		
		int data[] = { 20, 30, 40, 80, 10 };
		int max = data[0];
		int min = data[0];

		// 최댓값을 구하는 중첩 삼항자
		// 최소값을 구하는 중첩 삼항자
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) max = data[i];
			if (min > data[i]) min = data[i];
		}
		/*
		 for (int i = 1; i < data.length; i++) {
		 	max = (max > data[i]) ? max : data[i];
		 	min = (min < data[i]) ? min : data[i];
		 	}
		 */

		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}
}
