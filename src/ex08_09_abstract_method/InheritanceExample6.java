package ex08_09_abstract_method;


public class InheritanceExample6 {
	public static void main(String[] args) {
		
		EMailSender obj = new EMailSender("생일을 축하합니다", "고객 센터", "admin@khshod.co.kr", "10% 할인쿠폰이 발행되었습니다.");

		obj.sendMessage("hoho@naver.com");

		SMSSender obj1 = new SMSSender("생일을 축하합니다", "고객센터", "010-7777-7777", "10% 할인쿠폰이 발행되었습니다.");

		obj1.sendMessage("010-7777-7777");
		
	}
}

