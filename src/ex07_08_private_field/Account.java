
package ex07_08_private_field;

class Account {
	
	
	String accountNo;
	String ownerName;
	int balance;
	

	Account (String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
	//void : 리턴 값이 없음을 표시하는 자바 키워드
	//"예금한다" 기능을 구현하는 메소드 선언
	void deposit(int input) {  
		balance += input;
	}

	
	//"인출한다" 기능을 구현하는 메소드 선언
	int withdraw(int output) {
			if (balance < output)
				return 0;
			balance -= output;
			return output;
	}
	
}





