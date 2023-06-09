package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03_printf {

	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을때 사용합니다.
				//InputStream java.lang.System.in
				InputStream is = System.in;
				
				Scanner   sc =     new    Scanner(is);
				
				System.out.print("정수를 입력 하세요>");
				int a = sc.nextInt();
				
				System.out.print("정수를 입력 하세요>");
				int b = sc.nextInt();
				
				System.out.printf("%-5d + %5d = %d\n", a, b, (a + b));
				
				System.out.printf("%-5d - %5d = %d\n", a, b, (a - b));
				
				System.out.printf("%-5d * %5d = %d\n", a, b, (a * b));
				
				System.out.printf("%-5d / %5d = %d\n", a, b, (a / b));
				
				System.out.printf("%-5d %% %5d = %d\n", a, b, (a % b));
				
				sc.close();
			
	}

}
