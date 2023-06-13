package ex19_07_serialVersionUID;

class Rectangle implements java.io.Serializable {

	private static final long serialVersionUID = 3903152559552794709L;
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return "가로: " + width + "\n높이: " + height;
	}
//	int getArea() {
//		return width * height;
//	}

}
