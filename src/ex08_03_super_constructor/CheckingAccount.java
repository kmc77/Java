package ex08_03_super_constructor;
	//생성자가 있는 슈퍼 클래스를 상속받은 경우
	//에러 발생
/*
 	에러해결
 	컴파일러는 생성자 안에 슈퍼 클래스의 생성자 호출문이 있으면
 	no-arg constructor 호출문을 추가하지 않기 때문에
 	슈퍼 클래스의 생성자 호출문을 추가합니다.
 	슈퍼클래스의 생성자 호출 키워드는 super
 	슈퍼 클래스의 생성자 호출문을 생성자의 첫 번째 명령문에 있어야 합니다.
 */
class CheckingAccount extends Account {
		
		String cardNo; 
		
		//자바 컴파일러가 컴파일 시 서브 클래스의 생성자 첫번째 명령문이
		//슈퍼 클래스의 생성자 호출문이 아니면
		//자동으로 슈퍼 클래스의 no-arg constructor 호출문을 추가합니다.
		//하지만 슈퍼 클래스에는 no-arg constructor가 없어서 컴파일 에러 발생
		CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
			
			//파라미터 3개의 슈퍼 클래스 생성자 호출문
			//받드시 생성자의 첫번째 명령문이어야 합니다.
			super(accountNo, ownerName, balance); //Account(){}
			this.cardNo = cardNo;
		
		
		}

		int pay(String cardNo, int amount) throws Exception {
			if (!cardNo.equals(this.cardNo) || (balance < amount))
				throw new Exception("지불이 불가능합니다.");

			return withdraw(amount);
		}

	}
