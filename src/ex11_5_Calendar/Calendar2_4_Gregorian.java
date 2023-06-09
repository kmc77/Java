package ex11_5_Calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Calendar2_4_Gregorian {

	public static void main(String[] args) {
		
		String[] yo = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String[] ampm = {"오전", "오후"};
		
		//특정 날짜에 대한 정보를 얻고자 할 때 생성자에 년, 월, 일을 인자로 넘깁니다.
		Calendar c1 = new GregorianCalendar(2023,4,2);
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1; // 월이 0부터 11까지 구해져서 1을 더해야 한다.
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR); //12시간
		int ap = c1.get(Calendar.AM_PM); //오전 :0, 오후:1
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK); // 일요일:1, 월요일:2, 화요일:3...토요일:7
		
		System.out.print(y+"년 "+m+"월 "+d+"일 ");
		System.out.print(" " + ampm[ap] + " ");
		System.out.print(h1+":"+mm+":"+s+" ");
		System.out.print(yo[yoil-1]+" 입니다.");
		
		
		

	}

}

