package ex17_11_syn_format2;
class PrintThread extends Thread{

	private SharedArea sharedArea;

	PrintThread(SharedArea area) { // 생성자
		this.sharedArea = area;
	} //생성자 end

	public void run() {
		for (int i = 0; i < 3; i++) {
			
			int sum = sharedArea.getTotal();
			
			System.out.println("계좌 잔액 합계: " + sum);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}  
		}  
	} 
} 
