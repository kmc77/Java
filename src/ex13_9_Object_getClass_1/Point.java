package ex13_9_Object_getClass_1;

//Cloneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 혀용한다는 의미입니다.
public class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
