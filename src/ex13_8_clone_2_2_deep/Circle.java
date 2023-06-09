package ex13_8_clone_2_2_deep;
public class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	/*
	 공변 반환 타입(cobariant return type)-JDK1.5부터 적용
	 얕은 복사 - 객체에 저장된 값을 그대로 복제
	 객체가 참조하고 있는 객체까지 복제하지는 않습니다.
	 */

	//깊은 복사 - 원본이 참조하고 있는 객체까지 복제
	public Circle clone() { // 반환형이 Circle 형 입니다.
		try {
			Circle c = (Circle) super.clone(); // 조상의 clone()을 호출
			c.p = new Point(this.p.x , this.p.y );
			return c;
		} catch (CloneNotSupportedException e) {
			System.out.println("복사중 오류 입니다.");
			return null;
		}
	}

	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}

	}





