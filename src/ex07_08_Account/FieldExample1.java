package ex07_08_Account;

import java.util.Scanner;

//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
 class FieldExample1  {
	public static void main(String[] args) {
		
		Circle obj = new Circle(3.5);

		double area = obj.getArea();
		System.out.println("원의 반지름 = " + obj.radius);
		System.out.println("원의 넓이 = " + area);
		

	

		obj.radius = 5;
		area = obj.getArea();
		System.out.println("원의 반지름 = " + obj.radius);
		System.out.println("원의 넓이 = " + area);
	}

 }


