
package ex08_08_abstract_class;
//인스턴스화를 금지하는 abstract키워드
//abstract 키워드가 붙은 클래스를 추상 클래스 (abstract class)라고 한다.
abstract class Account { 

	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; // 잔액

	// 생성자
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) { // 예금한다.
		balance += amount;
	}

	final int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다"); 
		balance -= amount;
		return amount;
	}
}

