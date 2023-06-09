package ex07_08_private_field;

//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
 class FieldExample4  {
	public static void main(String[] args) {
		
		Account obj = new Account("111-222-33333333", "홍길동", 1000);
		print(obj);
		
		obj.deposit(1000);
		print(obj);
		
		obj.withdraw(500);
		print(obj);
		
	}

	public static void print(Account account) {
		System.out.println("계좌번호: " + account.accountNo);
		System.out.println("예금주 이름: " + account.ownerName);
		System.out.println("잔액: " + account.balance);
		System.out.println();
		
	}

 }


