//final class Account 를 상속 받아 에러 발생
//The type BonusPointAccount cannot subclass the final class Account
package ex08_12_polymorphism;

class InheritanceExample {
	public static void main(String[] args) {
		Account obj1 = new Account("111-22-333333", "임꺽정", 10000);
		System.out.println("계좌번호: " + obj1.accountNo);
		System.out.println("예금주 이름: " + obj1.ownerName);
		System.out.println("잔액: " + obj1.balance);
		System.out.println();

		CheckingAccount obj2 = new CheckingAccount("444-55-666666", "홍길동", 20000, "5555-6666-7777");
		System.out.println("계좌번호: " + obj2.accountNo);
		System.out.println("예금주 이름: " + obj2.ownerName);
		System.out.println("잔액: " + obj2.balance);
		System.out.println();

		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999", "김선달", 30000, 20000000);
		System.out.println("계좌번호: " + obj3.accountNo);
		System.out.println("예금주 이름: " + obj3.ownerName);
		System.out.println("잔액: " + obj3.balance);
		System.out.println();

		BonusPointAccount obj4 = new BonusPointAccount("000-00-000000", "김미영", 0, 0);
		System.out.println("계좌번호: " + obj4.accountNo);
		System.out.println("예금주 이름: " + obj4.ownerName);
		System.out.println("잔액: " + obj4.balance);
		System.out.println();
	}
}
