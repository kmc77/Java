package ex09_06_casting_error;

class RefTypeExample9 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-33333333", "홍길동", 100000);

		CheckingAccount obj2 = (CheckingAccount) obj1; // 컴파일러는 변수의 타입만 보고
		try {
			int amount = obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj2.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
