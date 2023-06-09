package ex17_08_syn_problem;

//계좌 이체를 수행하는 스레드 클래스
class TransferThread extends Thread {

	private SharedArea sharedArea;

	TransferThread(SharedArea area) { //생성자
		sharedArea = area;
	}

	public void run() {
		for (int i = 0; i < 12; i++) {
			sharedArea.getAccount1().withdraw(1000000);
			System.out.print("이몽룡 계좌: 100만원 인출, ");

			sharedArea.getAccount2().deposit(1000000);
			System.out.println("성춘향 계좌: 100만원 입금, ");
		}// for end
	}// run den
}// class end
