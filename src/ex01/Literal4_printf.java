package ex01;

public class Literal4_printf {
	public static void main(String[] args) {
		
		// 실수 42.195를 실수 서식(%f)으로 출력해라
		// (기본 소수점이하 6자리)
		System.out.printf("%f\n", 42.195);
		//System.out.println();
		
		// 실수 42.195를 실수 서식 소수점 이하 2자리(%.2f)로 출력해라.
		//\n(%n)은 출력 후 줄 바꾸라는 서식
		System.out.printf("%.2f%n", 42.195);
		
		System.out.printf("%6.3f%n", 42.195); //전체 6자리에 소수점과 소수점 이하 자리 3자리 출력
		System.out.printf("%7.3f%n", 42.195); //전체 7자리에 소수점과 소수점 이하 자리 3자리 출력
		
		// 정수 42를 정수 서식(%d)으로 출력해라
		System.out.printf("%d\n", 42);
		
		// 정수 42를 정수 서식(%10d)으로 출력해라 - 10칸의 자리, 오른쪽 정렬
		System.out.printf("%10d\n", 42);
		
		// 문자 'A'를 문자 서식 (%c)으로 출력해라
		System.out.printf("%c%n", 'A');
		
		// 문자 "홍길동"을 문자열 서식 (%s)로 출력해라
		System.out.printf("%s%n", "홍길동");
		
		// 문자 "홍길동"을 문자열 서식 (%10s)로 출력해라 - 10칸의 자리, 오른쪽 정렬
		System.out.printf("%10s\n", "홍길동");
		
		// 문자 "홍길동"을 문자열 서식 (%-10s)로 출력해라 - -10칸의 자리, 왼쪽 정렬
		System.out.printf("%-10s\n", "홍길동");
		System.out.println();
		
		
		System.out.printf("나의 이름은 %s, 나의 나이는 %d세 입니다.\n", "홍길동", 21);
		System.out.printf("나의 이름은 %10s, 나의 나이는 %5d세 입니다.\n", "홍길동", 21);
		System.out.printf("나의 이름은 %-10s, 나의 나이는 %-5d세 입니다.\n", "홍길동", 21);
		
		
		
	}
}
