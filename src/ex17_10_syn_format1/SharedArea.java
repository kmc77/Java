package ex17_10_syn_format1;

//공유 영역 클래스
class SharedArea {

	private Account account1; // 이몽룡의 계좌
	private Account account2; // 성춘향의 계좌

	SharedArea(Account a1, Account a2) {
		this.account1 = a1;
		this.account2 = a2;
	}

	void transfer() { // 계좌 이체를 한다
		synchronized (this) { // this: 동기화할 객체가 자기 자신입니다.
			account1.withdraw(1000000);
			account2.deposit(1000000);
		} // 동기화 끝
	} // transfer() end

	int getTotal() {
		synchronized (this) {
			return account1.getBalance() + account2.getBalance();
		} // 동기화 끝
	} // getTotal() end

	public Account getAccount1() {
		return account1;
	}

	public void setAccount1(Account account1) {
		this.account1 = account1;
	}

	public Account getAccount2() {
		return account2;
	}

	public void setAccount2(Account account2) {
		this.account2 = account2;
	}

}
