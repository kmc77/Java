package ex13_8_clone_0;

import java.util.GregorianCalendar;

public class ObjectExample1 {

	public static void main(String[] args) {
		// 객체를 생성합니다.
		GregorianCalendar obj1 = new GregorianCalendar(2023, 4, 2);

		// clone메서드로 객체를 복제합니다.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar) imsi;
		// 위 두 문장을 한 문장으로 표현하면 다음과 같습니다.
		// GregorianCalendar obj2 =(GregorianCalendar) obj1.clone();

		// %tF : 포맷 명세자는 날짜를 yyyy-MM-dd 형식으로 포맷하는 역할을 한다.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);

		obj1.set(2023, 10, 6);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);

	}

}
