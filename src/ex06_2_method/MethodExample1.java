package ex06_2_method;

public class MethodExample1 {
	
	//접근제어자   객제생성없이 접근가능  반환되는 값의 자료형  메서드 이름(매개변수 목록)
	public          static              void       main(String[] args) {

		print(); //메서드 호출하면 정의부 실행하고 다시 돌아온다.
		print();
	}
	
	//메서드 정의 
	public static void print() {
		System.out.println("print() 메서드 입니다.");
		
	}

}
