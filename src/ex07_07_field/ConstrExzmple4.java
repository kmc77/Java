package ex07_07_field;
//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
 class FieldExample1_method  {
	public static void main(String[] args) {
		
		Circle obj = new Circle(3.5);
		print(obj);
		
	
		obj.radius = 5.5;
		print(obj);
		

	}

	public static void print(Circle circle) {
		System.out.println("원의 반지름 = " + circle.radius);
		System.out.println("원의 반지름 = " + circle.getArea());
	}

 }


