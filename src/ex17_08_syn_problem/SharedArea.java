package ex17_08_syn_problem;
//공유 영역 클래스
class SharedArea {

	private Account account1; //이몽룡의 계좌
	private Account account2; //성춘향의 계좌

	SharedArea(Account account1, Account account2) {
		this.account1 = account1;
		this.account2 = account2;
	}

	// 클래스안에서 마우스 우클릭 -> Source
	// -> Generate Getters and Setter로 만들 수 있습니다.
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
