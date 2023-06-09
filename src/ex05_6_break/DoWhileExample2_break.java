package ex05_6_break;

import java.util.Scanner;
/*
 지역입력(exit = q)>서울
 입력하신 지역은 서울입니다.
 지역입력(exit = q)>부산
 입력하신 지역은 부산입니다.
 지역입력(exit = q)>q
 입력하신 지역은 q입니다.
 끝
 */

public class DoWhileExample2_break {

	public static void main(String[] args) {
		String location ;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("지역입력(exit = q)>");
			location = sc.next();
			if (location.equals("q")) {
				break;
			}
			
			System.out.println("입력하신 지역은 " + location + "입니다.");
		} while (true);
		
		System.out.println("끝.");
		sc.close();
	}	

}
