package ex07_00_object;

public class Saram_make6 {
	public static void main(String[] arge) {

		// 클래스 참조변수 = 연산자 생성자 호출
		Saram6 s = new Saram6("아이유", 47.4, 161.8, 29);
		s.eat();
		s.walk();

		Saram6 s2 = new Saram6("장범준", 64, 172, 33);
		s2.eat();
		s2.walk();
		
		Saram6 s3 = new Saram6("홍길동", 180.5);
		s3.age = 18;
		
	}

}
