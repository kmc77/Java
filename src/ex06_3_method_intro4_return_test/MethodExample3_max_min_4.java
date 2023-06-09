package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample3_max_min_4 {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		int max2, min2;
		System.out.print("다섯 개의 정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		max2 = max(data);
		min2 = min(data);
		
		System.out.println("max = " + max2);
		System.out.println("min = " + min2);

		sc.close();

	}
	//최댓값 구하는 메서드
	public static int max(int[] data) {
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
	
		}
		
		return max;
		
	}
	//최소값 구하는 메서드
	private static int min(int[] data) {
		int min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (min > data[i])
				min = data[i];
	
		}
		return min;
	}
	
	

}
