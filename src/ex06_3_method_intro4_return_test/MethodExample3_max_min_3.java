package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample3_max_min_3 {

	public static void main(String[] args) {
		int n1, n2, max2, min2;
		System.out.print("두 개의 정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		
		max2 = max(n1, n2);
		min2 = min(n1, n2);
		
		System.out.println("max = " + max2);
		System.out.println("min = " + min2);

		sc.close();

	}
	//최댓값 구하는 메서드
	public static int max(int a, int b) {
		return a>b ? a:b;
	}
	//최소값 구하는 메서드
	private static int min(int a, int b) {
		return a<b ? a:b;
	}
	
	

}
