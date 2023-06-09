package ex17_02_Thread_sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

class MultithreadExample3_Test {

	public static void main(String[] args) {

		while (true) {
			Date d = new Date();

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초 ");
			String t = sdf1.format(d);
			System.out.println(t);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
