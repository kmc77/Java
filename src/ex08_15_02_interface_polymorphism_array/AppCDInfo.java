package ex08_15_02_interface_polymorphism_array;

class AppCDInfo extends CDInfo implements Lendable {

	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태
	String writer; // 추가된 부분

	// 생성자 수정
	AppCDInfo(String registerNo, String title, String writer) {
		super(registerNo, title);
		this.name = writer;
	}

	// public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	// 대출한다.
	@Override
	public void checkOut(String borrower, String date) {
		if (state != 0) // 처음 state 값은?(0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; // 대출상태 : state = 1
		System.out.println("*" + title + " CD가 대출되었습니다.");
		System.out.println("저 자:" + writer); // 추가된 부분
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");

	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + " CD가 반납되었습니다.\n");

	}

}

//1. 클래스 이름 : AppCDInfo(부모: CDInfo, Lendable )
//2. 생성자 : (registerNo, title)
//               부모 생성자 호출로 매개변수의 값으로 필드 초기화
//3. 필드 : 
//    String borrower;         // 대출인
//    String checkOutDate;     // 대출일
//    byte state;              // 대출상태
//4. 메서드 - 오버라이딩
//    checkOut(String borrower, String date)
//    기능1) 만일 대출상태가 0이 아니면 메서드 종료
//    기능2) 두 개의 매개변수를 이용해 필드 초기화  
//    기능3) 대출상태를 1로 변경
//    기능4)   System.out.println("*" + title + " CD가 대출되었습니다.");
//               System.out.println("대출인:" + borrower);
//               System.out.println("대출일:" + date + "\n");    
//5. 메서드 -오버라이딩
//    checkIn()
//    기능1) 대출인, 대출일을 null로 변경
//    기능2) 대출상태를 0으로 변경
//    기능3) System.out.println("*" + title + " CD가 반납되었습니다.\n");
