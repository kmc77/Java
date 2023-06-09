
package ex08_03_super_constructor;
//생성자가 있는 Account 클래스
//은행 계좌 클래스

class Account { // 컴파일러가 extends Object 를 추가합니다.
	
	
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; 	  // 잔액	
	
	//생성자
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	
	void deposit(int amount) {  //예금한다.
		balance += amount;
	}

	
	//"인출한다" 기능을 구현하는 메소드 선언
	int withdraw(int amount) throws Exception {
			if (balance < amount)
				throw new Exception("잔액이 부족합니다"); // 의도적으로 에러 발생
			balance -= amount;
			return amount;
	}
	
}





