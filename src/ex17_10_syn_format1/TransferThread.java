package ex17_10_syn_format1;

class TransferThread extends Thread {

	private SharedArea sharedArea;

	TransferThread(SharedArea area) { // 생성자
		sharedArea = area;
	}

	public void run() {
		for (int i = 0; i < 12; i++) {
			sharedArea.transfer();
		}
	}
}
