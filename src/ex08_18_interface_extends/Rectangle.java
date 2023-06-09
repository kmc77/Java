package ex08_18_interface_extends;

/*
1. 클래스 이름 : Rectangle(부모 : Transformable)
2. 생성자 : 필드 초기화(int x, int y, int width, int height)
3. 필드 : 
int x, y, width, height;
4. 메서드 - 오버라이딩
resize(int width, int height) 
    기능) 두 개의 매개변수를 이용해 필드 초기화  

5. 메서드 -오버라이딩
moveTo(int x, int y)
 기능) 두 개의 매개변수를 이용해 필드 초기화  
 
6. 메서드 -오버라이딩
moveBy(int xOffset, int yOffset)
 기능) 기존 x값에 xOffset을 더해 x를 구한다.
      기존 y값에 yOffset을 더해 y를 구한다.
      */
class Rectangle implements Transformable {

	int x, y, width, height;

	Rectangle(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

	// Transformable 인터페이스의 메소드를 구현
	@Override
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;

	}

	// Movable 인터페이스의 메서드를 구현
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public void moveBy(int xOffset, int yOffset) {
		this.x += xOffset;
		this.y += yOffset;

	}

}
