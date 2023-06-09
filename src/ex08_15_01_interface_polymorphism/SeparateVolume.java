package ex08_15_01_interface_polymorphism;

class SeparateVolume implements Lendable {

	String requestNo; // 청구번호
	String bookTitle; // 제목
	String writer; // 저자
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태

	SeparateVolume(String requestNo, String bookTitle, String writer) {

		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;

	}

	@Override
	public void checkOut(String borrower, String date) { //대출한다
		if (state != 0)  //처음 state 값은?(0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; // 대출상태 : state = 1
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
		

	}

	@Override
	public void checkIn() { //반납한다
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0; // 반납 상태 : state = 0
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
	}
}

//
//1. 클래스 이름 : SeparateVolume(부모 : Lendable)
//2. 생성자 : 필드 초기화(requestNo, bookTitle,writer)
//3. 필드 : 
//    String requestNo;      // 청구번호
//    String bookTitle;      // 제목
//    String writer;         // 저자
//    String borrower;       // 대출인
//    String checkOutDate;   // 대출일
//    byte state;            // 대출상태
//4. 메서드 - 오버라이딩
//    checkOut(String borrower, String date)
//    기능1) 만일 대출상태가 0이 아니면 메서드 종료
//    기능2) 두 개의 매개변수를 이용해 필드 초기화  
//    기능3) 대출상태를 1로 변경
//    기능4)  System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
//              System.out.println("대출인:" + borrower);
//              System.out.println("대출일:" + date + "\n"); 
//5. 메서드 -오버라이딩
//    checkIn()
//    기능1) 대출인, 대출일을 null로 변경
//    기능2) 대출상태를 0으로 변경
//    기능3) System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");


