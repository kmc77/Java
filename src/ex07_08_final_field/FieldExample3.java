package ex07_08_final_field;

import java.util.Scanner;

//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
 class FieldExample3  {
	public static void main(String[] args) {
		
		System.out.print("반지름을 입력하세요>");
		Scanner sc = new Scanner(System.in);
		
		Circle obj = new Circle(sc.nextDouble());
		print(obj);
		sc.close();
		

	}

	public static void print(Circle circle) {
		System.out.println("원의 반지름 = " + circle.radius);
		System.out.println("원의 넓이 = " + circle.getArea());
	}

 }


