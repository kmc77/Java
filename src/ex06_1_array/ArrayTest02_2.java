package ex06_1_array;

import java.util.Scanner;

public class ArrayTest02_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		int arr[] = new int[5];
		
		System.out.print("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		
		avg=(double)sum/(arr.length); 
		System.out.println("합 =" + sum +"\n평균 = " + avg);
		
		System.out.println("========================");
		System.out.printf("합 =%5d\n평균 =%5.1f", sum, avg);	
		sc.close();
	}
}
