package ex10_09.geometry.shape;

//슈퍼 클래스의 protected 구성요소를 사용하는 서브 클래스
import ex10_09.geometry.common.Polygon;

public class Square extends Polygon {

	public Square(int x, int y, int sideLength) {
		super(4);
		setPoint(0, x, y); // 슈퍼 클래스의 protected 생성자 호출
		setPoint(1, x + sideLength, y); // 슈퍼 클래스의 protected 메서드 호출
		setPoint(2, x + sideLength, y + sideLength);
		setPoint(3, x, y + sideLength);

	}

	public int getX(int index) {
		return x[index];
	}

	public int getY(int index) {
		return y[index]; // 슈퍼 클래스의 protected 필드 사용
	}

}
