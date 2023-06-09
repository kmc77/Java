//final class Account 를 상속 받아 에러 발생
//The type BonusPointAccount cannot subclass the final class Account
package ex08_12_polymorphism;
class BonusPointAccount extends Account {

	int bonusPoint;

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;

	}

	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}
}
