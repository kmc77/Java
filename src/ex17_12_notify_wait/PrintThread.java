package ex17_12_notify_wait;

//파이를 출력하는 스레드 클래스
class PrintThread extends Thread {

	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		if (sharedArea.isReady() != true) { //파이가 계산 중인 경우
			/* 이전의 방식 - 파이 계산이 끝날때 까지 계속 체크해야 했습니다.
			 * while (SharedArea.isReady != true) {
			 		Sjystem.out.println("실행중 ~");
			 		}
			 */
			try {
				synchronized (sharedArea) {
					sharedArea.wait(); // 다른 스레드로 부터 신호를 기다립니다.
					// 파이의 계산이 끝나면 다른 스레드에서 신호를 보냅니다.
				}
			} // try end
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			} // catch end
		} // if end

		// 공유 영역의 데이터를 출력
		System.out.println(sharedArea.getResult());
	}
}
