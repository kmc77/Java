package ex08_05_super_method;
class InheritanceExample {

	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("111-22-33333333",
												  "최경민", 0, 0 ); //생성자 호출
			obj.deposit(1000);
			System.out.println("잔액: " + obj.balance);
			System.out.println("누적 포인트: " + obj.bonusPoint);
	}

}
