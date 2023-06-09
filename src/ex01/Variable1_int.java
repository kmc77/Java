package ex01;

public class Variable1_int {
	public static void main(String[] args ) {
		System.out.println("============정수형 변수============");
		// 정수형 변수
		byte b = 10;
		short s = 100;
		int i = 1000;
		
		// 8바이트(l[소문자 엘] 또는 L을 숫자 뒤에 붙입니다.)
		long l = 10000L;
		
		System.out.println(b); // 변수 b의 값을 출력하라는 의미 입니다.
		
		// 문자열 + 변수의 경우 문자열 내용이 출력되고 b의 값이 출력됩니다.
		// 여기서 +는 더하기의 개념이 아닌 문자열 연결을 의미합니다.
		// +를 기준으로 문자열이 앞 또는 뒤에 존재하는 경우 모두 문자열로 취급합니다.
		System.out.println("b=" + b); // b=10
		System.out.println("s=" + s); // s=100
		System.out.println("i=" + i + " l=" + l); // i=1000 l=10000
		
		System.out.println("b=" + b + 1);
		System.out.println("s=" + s + 1);
		
		//괄호 안에 넣으면 우선순위로 계산
		System.out.println("b=" + (b + 1)); // b=11 
		System.out.println("s=" + (s + 1)); // s=101
		
	}
}
