
package ex17_08_syn_problem;

//은행 계좌 클래스
class Account {

	private String accountNo; // 계좌번호
	private String ownerName; // 예금주 이름
	private int balance; // 잔액

	// 클래스안에서 마우스 우클릭 -> Source -> Generate Getters and Setters로 만들 수 있습니다.
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		
		return 0;
	}
}