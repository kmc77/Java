package ex07_00_object;

public class Saram_make2 {
	public static void main(String[] arge) {

		// 클래스 참조변수 = 연산자 생성자 호출
		Saram2 s = new Saram2();
		s.name = "아이유";
		s.w = 47.4;
		s.ki = 161.8;
		s.age = 29;
		s.eat();
		s.sesu();
		s.walk();

		Saram2 s2 = new Saram2();
		s2.name = "장범준";
		s2.age = 33;
		s2.w = 64;
		s2.ki = 172;
		s2.eat();

	}

}
