package ex17_11_syn_format2;

//공유 영역 클래스
class SharedArea {

	private Account account1; // 이몽룡의 계좌
	private Account account2; // 성춘향의 계좌

	SharedArea(Account a1, Account a2) {
		this.account1 = a1;
		this.account2 = a2;
	}
	//동기화 메서드
	synchronized void transfer() {
		account1.withdraw(1000000);
		account2.deposit(1000000);
	}
	//동기화 메서드
	synchronized int getTotal() {
		return account1.getBalance() + account2.getBalance();
	}

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
