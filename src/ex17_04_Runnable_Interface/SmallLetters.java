package ex17_04_Runnable_Interface;

//Runnable인터페이스를 이용한 멀티스레드 프로그램
class SmallLetters implements Runnable {

	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}
