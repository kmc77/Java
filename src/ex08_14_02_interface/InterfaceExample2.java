package ex08_14_02_interface;
//단행본 클래스와 부록 CD 클래스를 사용하는 프로그램
class InterfaceExample2 {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		obj1.checkOut("홍길동", "2023-05-17");
		obj1.checkIn();
		
		AppCDInfo obj2 = new AppCDInfo("1000-2000", "베토벤 운명");
		obj2.checkOut("홍길동", "2023-05-17");
		obj2.checkIn();
		
	}

}
