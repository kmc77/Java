package ex06_2_method;

public class MethodExample9 {

	// 접근제어자 객제생성없이 접근가능 반환되는 값의 자료형 메서드 이름(매개변수 목록)
	public static void main(String[] args) {
		
		int num = 20;
		char data = '*';
		print(num, data); // 메서드명(인자)
	}

	// 메서드 정의         메서드명(타입 매개변수)
	public static void print(int n, char p) { 
		for (int i = 0; i < n; i++) {
			System.out.print(p);
		}

	}

}
