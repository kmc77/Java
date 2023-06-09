package ex13_8_clone_1;
//복제 가능한 클래스로 만들기
//1단계 - Cloneable 인터페이스 구현
//2단계 - Clone()메서드 오버라이드하기

//Cloneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 혀용한다는 의미입니다.
public class Rectangle implements Cloneable {
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/*
	 Object 클래스에 정의된 clone()
	 protected Object clone() throws CloneNotSupportedException;
	 ==> 오버라이딩시 접근 제어자 변경
	 (protected => public : 상속관계 없이 다른 클래스에서 호출 할 수 있습니다.)
	 */

	public Object Clone() { //반환형이 Object 형 입니다.
		try {
			// 슈퍼 클래스의 clone메서드를 호출해서 그 결과를 리턴
			return super.clone();
		}
		// 슈퍼 클래스의 clone메서드가 발생하는 익셉션을 처리
		catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public String toString() {
		return "x=" + width + " y=" + height;
	}

	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return this.width == r.width && this.height == r.height;
		} else
			return false;

	}
}
