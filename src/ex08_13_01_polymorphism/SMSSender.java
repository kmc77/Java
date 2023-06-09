
package ex08_13_01_polymorphism;
//메시지 발송 클래스를 상속하는 문자 메시지 송신 클래스
class SMSSender extends MessageSender { 

	String returnPhoneNo;
	String message;

	SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	// 슈퍼 클래스의 메서드를 오버라이드하는 메서드
	// 추상 메서드를 구현 (implement)

	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------------");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName);
		System.out.println("전화번호: " + recipient);
		System.out.println("회신 전화번호: " + returnPhoneNo);
		System.out.println("메시지 내용: " + message);

	}

}
