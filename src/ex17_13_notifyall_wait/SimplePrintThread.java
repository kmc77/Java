package ex17_13_notifyall_wait;

//파이를 소수점 두자리까지 출력하는 클래스
class SimplePrintThread extends Thread {

	private SharedArea sharedArea;

	SimplePrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		if (sharedArea.isReady() != true) {
			synchronized (sharedArea) {
				try {
					sharedArea.wait(); // 신호를 기다립니다.
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.printf("SimplePrintThread : %.2f %n", sharedArea.getResult());
	}
}
