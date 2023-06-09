package ex05_5_for;

import java.util.Scanner;

public class ForExample4_gugudan_Scanner {

	public static void main(String[] args) {
		
		System.out.print("원하는 단을 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		System.out.println("["+dan+"단]");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
		
		sc.close();
		
	}

}
