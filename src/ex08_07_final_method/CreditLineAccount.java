
package ex08_07_final_method;
//상속 받은 withdraw 메서드가 final 메서드라 오버라이딩 불가
class CreditLineAccount extends Account {

	int creditLine;

	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;

	}

	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		return amount;
	}

}
