package ex17_13_notifyall_wait;

//notify메서드 사용 예
public class MultithreadExample {

	public static void main(String[] args) {
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		LuxuryPrintThread thread4 = new LuxuryPrintThread(obj);
		SimplePrintThread thread3 = new SimplePrintThread(obj);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
