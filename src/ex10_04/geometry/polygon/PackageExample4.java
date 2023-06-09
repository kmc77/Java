//import 선언문 :
//다른 패키지에 속하는 클래스나 인터페이스를 패키지 이름 없이 사용할 수 있게 됩니다.
//패키지 선언문이 있을 경우에는 패키지 선언문보다 뒤에 써야 합니다.

package ex10_04.geometry.polygon;

import ex10_04.math.Rectangle;

public class PackageExample4 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(2, 3);
		System.out.println("가로 = " + obj.width);
		System.out.println("높이 = " + obj.height);
		System.out.println("면적 = " + obj.getArea());

	}

}


