package ex04_06_arithmetic_op;
//값을 입력받는 Scanner 클래스를 사용해 봅시다.
//Scanner  클래스는 java.util 패키지에 있습니다.
//nextInt() : 키보드로 부터 정수형의 값을 입력 받는 메서드입니다.
import java.io.InputStream;
import java.util.Scanner;
//ctrl + shift + o
public class Oper02_input {

	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을때 사용합니다.
		InputStream is = System.in;
		
		//java.util.Scanner.Scanner(InputStream source)
		//클래스명  참조형 변수  연산자   생성자 호출
		Scanner   sc =      new     Scanner(is);
		
		//콜솔에서 " 정수를 입력 하세요>" 다음에 커서를 위치하고 숫자 입력 후 엔터
		System.out.print("두 정수를 입력 하세요>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("입력값은 " + a + "입니다.");
		System.out.println("입력값은 " + b + "입니다.");
		
		//System.out.print("정수를 입력 하세요>");
		
		//System.out.println("입력값은 " + b + "입니다.");
		
		
		sc.close();
	}

}
