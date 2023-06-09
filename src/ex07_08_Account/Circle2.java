/*
	 객체 지향 프로그래밍의 주요 특징 중 하나인 캡슐화는 클래스 멤버를 클래스 내부에 감추는 것입니다.
	 클래스 멤버를 외부에서 조작할 수 없도록 은닉하기위해 private을 사용합니다.
	 하지만 일부 멤버는 외부 회로를 캡슐화해서 은폐하지만 전원 버튼,
	 음량 조절 버튼 등은 외부에 노출해서 사용할 수 있게 합니다.
	 이처럼 클래스 내부에 은닉한 필드를 외부에서 사용할 수 있도록
	 Getter와 Setter를 제공 합니다.
	 일반적으로 Getter는 get, Setter는 set으로 시작하는 이름을 사용합니다.
	 radius 필드에 접근 하기 위해서 getRadius(), setRadius() 메서드를 사용합니다.
	 */

package ex07_08_Account;

class Circle2 {
	
	// 접근 제어자 private은 클래스 내부에서 사용가능합니다. => 정보의 은닉
	private double radius;
	
	final double PI = 3.14;
	Circle2 (double radius) {
		this.radius = radius;
		
	}
	
	
	double getArea() {  
		 return radius * radius * PI;
	}
	//getter 메서드
	public double getRadius() {
		return radius;
	}
	//setter 메서드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}





