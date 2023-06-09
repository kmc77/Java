
package ex08_13_01_polymorphism;
// 추상 메서드를 포함하는 클래스 - 메시지 전송 클래스
abstract class MessageSender {  //클래스 자체도 추상 클래스로 선언

	String title; //제목
	String senderName; // 발송자 이름

	// 생성자
	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	//abstract : 인스턴스화 할 수 없다.
	abstract void sendMessage(String recipient);  //추상 메서드 - 메시지를 송신한다.
		
	
}
		
	

