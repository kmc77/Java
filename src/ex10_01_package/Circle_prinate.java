package ex10_01_package;

private class Circle_prinate {
	int radius;
	
	Circle_prinate(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * 3.14;
	}
}
