package ex11_5_Calendar;

import java.util.GregorianCalendar;

public class Calendar3_1_Today {
	public static void main(String[] agrs) {
		System.out.println("===== 오늘의 날짜 ======");
		Today t = new Today();
		System.out.println(t.toString());
		System.out.println(t);

		
		System.out.println("===== 특정 날짜 ======");
		GregorianCalendar g = new GregorianCalendar(2023,4,2);
		Today t2 = new Today(g);
		System.out.println(t2.toString());
		System.out.println(t2);
	}

}

