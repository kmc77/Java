/*
 * 90~100 이상 "A"
 * 80~89 "B"
 * 70~79 "C"
 * 60~69 "D"
 * 60미만 "F"
 * 
 * if~else if~else문으로 작성합니다. 
 */



package ex05_1_if;
import java.util.Scanner;
public class If04_01_hakjum1 {

	public static void main(String[] args) {
		System.out.print("정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		
		if (jumsu >= 90) {
			System.out.println("A학점");
		} else if (jumsu >= 80) {
			System.out.println("B학점");
		} else if (jumsu >= 70) {
			System.out.println("C학점");
		} else if (jumsu >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		System.out.println("끝.");
		sc.close();
	}

}
