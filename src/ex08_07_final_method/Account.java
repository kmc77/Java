
package ex08_07_final_method;
//final 키워드를 이용한 메서드 오버라이딩 금지
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

	final int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다"); 
		balance -= amount;
		return amount;
	}
}

