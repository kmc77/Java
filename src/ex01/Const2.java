package ex01;
//상수: 값을 한 번만 저장할 수 있는 공간
//상수 만드는 법: 변수 타입 앞에 키워드 final만 붙여 주기만 하면 됩니다. 
public class Const2 {
	//필드
	public static void main(String[] args) {
		final int MAX = 500;
		System.out.println(MAX);
		//MAX = 1000; // 값을 변경하는 문장을 사용하면 에러가 발생합니다.
		
		// local variable 메서드 안에서 실행되는 값
	}

}
