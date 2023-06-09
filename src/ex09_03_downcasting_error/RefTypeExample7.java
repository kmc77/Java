package ex09_03_downcasting_error;
//obj 변수의 타입이 Account이기 때문에

//Account에 없는 pay메서드나 cardNo필드는 컴파일 에러 발생

class RefTypeExample7 {

	public static void main(String[] args) {
		Account obj1 = new CheckingAccount("111-22-33333333", "홍길동", 100000, "4444-5555-6666-7777");

		CheckingAccount obj2 = (CheckingAccount) obj1; // 컴파일러는 변수의 타입만 보고
		// 대입 가능성을 검사하기 때문에 에러발생
		try {
			int amount = obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj2.cardNo);
			System.out.println("잔액: " + obj2.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
