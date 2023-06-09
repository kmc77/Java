package ex06_2_method;

public class MethodExample11_1 {

	// 접근제어자 객제생성없이 접근가능 반환되는 값의 자료형 메서드 이름(매개변수 목록)
	public static void main(String[] args) {
		
		int num = 20;
		char data = '*';
		print(num, data); // 메서드명(인자)
		return; //여기서 main() 메서드를 종료합니다.
	}

	// 메서드 정의         메서드명(타입 매개변수)
	public static void print(int n, char p) { 
		for (int i = 0; i < n; i++) {
			System.out.print(p);
		}
		return; //반환되는 값의 자료형이 void인 경우 이 문장은 생략 가능합니다.

	}

}
