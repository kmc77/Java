package ex11_6_DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample1_Date {

	public static void main(String[] args) {


		//현재 시스템 날짜와 시간 구하는 방법
		//클래스 Date 이용하는 방법 - 현재 시스템 날짜와 시간 구합니다.
		Date d = new Date();
		System.out.println("Date 사용 : " + d);
		//System.out.println(new Date ());//위 두 문장과 같은 의미
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년mm월dd일");
		System.out.println(sd1.format(d)); //yyyy-mm-dd 형태로 출력
		System.out.println(sd2.format(d)); //yyyy년mm월dd일 형태로 출력
		
		
		/* 379페이지 참고하세요
		   생성자의 매개변수는 날짜와 시간의 포맷을 작성하여 넘겨줍니다.
		   패턴문자	의미
		   y		년
		   m		월
		   d		일
		   D		일(1~365)
		   E		요일
		   a		오전/오후
		   H		시(0~23)
		   h		시(1~12)
		   m		분
		   s		초
		   S		1/1000초
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a h시 m분 s초 E요일");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
		System.out.println(sdf2.format(d));
	}

}
