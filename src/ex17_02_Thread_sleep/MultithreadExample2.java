package ex17_02_Thread_sleep;

class MultithreadExample2 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
				// sleep 메서드 : 일정 시간이 경과되기를 기다리는 메소드.
				// public static void sleep(long millis) throwe InterruptedException
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			} // catch end
		} // for end
	}// main end
}// class end
