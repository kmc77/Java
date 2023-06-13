package ex19_06_serialVersionUID_no;

class Rectangle implements java.io.Serializable{
	
	private int width, height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "가로: " + width + "\n높이: " + height;
	}
	/* 실행방법
	 
	 
	 */
	int getArea() {
		return width * height;
	}

}
