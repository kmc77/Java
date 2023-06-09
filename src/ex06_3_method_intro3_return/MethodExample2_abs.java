package ex06_3_method_intro3_return;

import java.util.Scanner;

public class MethodExample2_abs {

	public static void main(String[] args) {

		System.out.print("정수를 입력 하세요?>");
		Scanner sc = new Scanner(System.in);
		//int inputdata = sc.nextInt();
		//int result = abs(sc.nextInt());
		

		System.out.println("절대값 : " + abs(sc.nextInt()));

		sc.close();
	}

	public static int abs(int data) {
		if (data < 0)
			data = -data;
		return data;
	}

}
