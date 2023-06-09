package ex05_2_switch;

import java.util.Scanner;

public class Test__1 {

	public static void main(String[] args) {
		System.out.print("학점을 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		s = s / 10;
		String grade = "F";
		switch (s) {
		case 10 :	
		case 9 :	
			grade = "A학점";
			break;
		case 8 :
			grade = "B학점";
			break;
		case 7 :
			grade = "C학점";
			break;
		case 6 :
			grade = "D학점";
		}
		System.out.println(grade);
	    System.out.println("끝.");
	    sc.close();
	}

}
