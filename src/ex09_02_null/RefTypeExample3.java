package ex09_02_null;
//지역 변수 obj에 초기화 하지 않아 컴파일 에러 발생

//obj 변수에 null이라는 참조값이 있기 때문에 
public class RefTypeExample3 {

	public static void main(String[] args) {
		// Point obj; 에러
		Point obj = null; // 아무 데이터도 가리키지 않는 참조값
		// The local variable obj may not have been initialized
		System.out.println(obj.x);

		System.out.println(obj.y);

	}

}
