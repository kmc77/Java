package ex04_06_arithmetic_op;

import java.util.Scanner;

public class board3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요?");
		int inputdata = sc.nextInt();
		
		int output = (inputdata - 1) / 10 * 10 ;
		System.out.println(output);
		
		sc.close();

	}

}
