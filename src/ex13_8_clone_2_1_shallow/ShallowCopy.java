package ex13_8_clone_2_1_shallow;
//clone() 메서드는 객체를 복제하는 기능을 합니다.

public class ShallowCopy {

	public static void main(String[] args) {
		// 객체를 생성합니다.
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.clone();

		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);

		c1.p.x = 9;
		c1.p.y = 9;
		c1.r = 4;

		System.out.println("===== c1 변경 후 =====");
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);

	}

}
