package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class This_Calendar_for {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 년도를 입력 하세요>");
		int year = sc.nextInt();
		System.out.print("출력할 달를 입력 하세요>");
		int month = sc.nextInt();
		sc.close();

		Calendar c = new GregorianCalendar(year, month - 1, 1);
		int lastday = c.getActualMaximum(Calendar.DATE);
		int day_of_week = c.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2:월요일, ... 7:토요일

		String yoil[] = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONDAY) + 1) + "월" + "\n ");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}

		System.out.println();
		for (int i = 0; i < 51; i++)
			System.out.print("=");
		System.out.println();

		// 공백을 찍는다.
		/*
		 * c.get(Calendar.DAY_OF_WEEK)=1 일요일 공백 없어요 c.get(Calendar.DAY_OF_WEEK)=2 월요일 공백
		 * 한개 c.get(Calendar.DAY_OF_WEEK)=3 화요일 공백 두개
		 */

		for (int i = 1; i < day_of_week; i++) {
			System.out.println("\t");
		}

		// 날짜를 찍어요
		for (int i = 1; i <= lastday; i++) { // day_of_week=1이면 i=(7, 14, 21, 28)일때 줄 바뀌어요
												// day_of_week=2이면 i=(6, 13, 20, 27)일때 줄 바뀌어요
												// day_of_week=3이면 i=(5, 12, 19, 26)일때 줄 바뀌어요
			System.out.print(i + "\t");

			if ((day_of_week + i) % 7 == 1)
				System.out.println("\n");
		}

	}

}
