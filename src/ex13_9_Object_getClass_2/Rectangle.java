package ex13_9_Object_getClass_2;

class Rectangle {
	private int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	void write(int a) {
		System.out.println("넓이 = " + width);
		System.out.println("높이 = " + height);

	}
}
