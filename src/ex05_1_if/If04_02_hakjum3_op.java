package ex05_1_if;

import java.util.Scanner;

public class If04_02_hakjum3_op {

	public static void main(String[] args) {
		System.out.print("정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		int mok = jumsu/10;
		
		
		String grade = "F"; 
		if (mok == 9 || mok == 10) {
			
			grade = "A";
		} else if (mok == 8) {
			grade = "B";
		} else if (mok == 7) {
			grade = "C";
		} else if (mok == 6) {
			grade = "D";
		}

		System.out.println(grade + "학점");
		System.out.println("끝.");
		sc.close();
		
	}

}
