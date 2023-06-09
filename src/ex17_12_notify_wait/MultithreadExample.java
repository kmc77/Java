package ex17_12_notify_wait;

//notify메서드와 wait메서드 사용 예
/*
 	- 스레드 사이에 신호를 직접 주고 받을 수 있습니다.
 	동기화된 스레드는 동기화 블록에서 다른 스레드에게 제어권을 넘기지 못합니다.
 	이와 같이 동기화된 블록에서 스레드간의 통신(제어권을 넘김) 하기 위해서
 	wait(), notify(), notifyAll() 메서드를 사용해야 합니다.
 	이 메서드를 사용할 때는 synchronized 블록에서만 의미가 있습니다.
 */
public class MultithreadExample {

	public static void main(String[] args) {
		// 공유 영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장합니다.
		SharedArea obj = new SharedArea();

		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);

		thread1.start();
		thread2.start();

	}

}
