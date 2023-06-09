package ex17_08_syn_problem;
//계좌 잔액 합계를 출력하는 스레드 클래스
class PrintThread extends Thread{

	private SharedArea sharedArea;

	PrintThread(SharedArea area) {
		this.sharedArea = area;
	} //생성자 end

	public void run() {
		for (int i = 0; i < 3; i++) {
			int sum = sharedArea.getAccount1().getBalance()
					+ sharedArea.getAccount2().getBalance();
			System.out.println("계좌 잔앵 합계: " + sum);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			} // catch end
		} // for end
	}// run end
}// class edn
