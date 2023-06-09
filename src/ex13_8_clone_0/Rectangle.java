package ex13_8_clone_0;

//Cloneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 혀용한다는 의미
class Rectangle {
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String toSting() {
		String result = "x=" + width + " y=" + height;
		return result;
	}

	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return this.width == r.width && this.height == r.height;
		} else
			return false;

	}
}
