package ex06_2_method;

public class MethodExample13 {

	// 접근제어자 객제생성없이 접근가능 반환되는 값의 자료형 메서드 이름(매개변수 목록)
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		
		print(num); // 메서드명(인자)
		return; // 여기서 main() 메서드를 종료합니다.
	}

	// 메서드 정의 메서드명(타입 매개변수)
	public static void print(int[] n) {
		for (int num : n) {
			System.out.print(num+" ");
		}
		return; // 반환되는 값의 자료형이 void인 경우 이 문장은 생략 가능합니다.

	}

}
