package ex01;

public class Casting3_int_char {

	public static void main(String[] args) {
			
		//int  -> char(명시적 형변환)
		int i3 = 97;
		char c1 = 97;
		System.out.println("i3데이타는 " + i3 + "입니다.");
		System.out.println("c1데이타는 " + c1 + "입니다.");
		
		i3 = 65;
		c1 = (char)i3;
		System.out.println("i3데이타는 " + i3 + "입니다.");
		System.out.println("c1데이타는 " + c1 + "입니다.");
		
		//char -> int (자동 형변환)
		i3='A'; //유니코드 'A'에 해당하는 값을 정수형 변수 i3에 대입해라
		System.out.println("i3='A'데이타는 " + i3 + "입니다.");
		
		i3='가'; //유니코드 '가'에 해당하는 값을 정수형 변수 i3에 대입해라
		System.out.println("i3='가'데이타는 " + i3 + "입니다.");
	}

}
