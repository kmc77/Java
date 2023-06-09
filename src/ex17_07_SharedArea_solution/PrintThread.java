package ex17_07_SharedArea_solution;

//파이를 출력하는 스레드 클래스
class PrintThread extends Thread {

	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		System.out.println("공유 영역의 데이터 = " + sharedArea.getResult()); // 공유 영역의 데이터 출력합니다.
	}

}
