
package ex09_03_upcasting;
// 메시지 발송 클래스를 상속받는 이메일 송신 클래스
class Account {

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

	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다"); 
		balance -= amount;
		return amount;
	}
}