package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample3_max_min_5 {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		System.out.print("다섯 개의 정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		int[] result = max_min(data);
		
		
		System.out.println("max = " + result[0]);
		System.out.println("min = " + result[1]);

		sc.close();

	}
	//최댓값 최솟값을 구하는 메서드
	public static int[] max_min(int[] data) {
		int result[] = {data[0], data[0]};
		
		for (int i = 1; i < data.length; i++) {
			if (result[0] < data[i]) result[0] = data[i]; // max
			if (result[1] > data[i]) result[1] = data[i]; // min
		}
		
	
		return result;

	}
}
