package ex10_09.main;

import ex10_09.geometry.shape.Square;

public class AccessControlExample2_print {

	public static void main(String[] args) {
		Square obj = new Square(100, 200, 15);
		print(obj);

	}

	static void print(Square obj) {
		for (int i = 0; i < obj.x.length; i++) {
			int x = obj.getX(i);
			int y = obj.getY(i);
			System.out.print("x[" + i + "]=" + x + ",");
			System.out.println("y[" + i + "]=" + y);
		}

		for (int i = 0; i < 4; i++) {
			int x = obj.getX(i);
			int y = obj.getY(i);
			System.out.println("(" + x + "," + y + ")");

		}

	}// print method
}// class
