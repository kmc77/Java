package ex17_07_SharedArea_solution;

//CalcThread 가 계산된 파이 값을 공유 영역에 쓰기도 전에
//PrintThread가 공유 영역에 데이터를 읽어 갔기 때문에
//result 필드가 가지고 있던 기본깞 0.0이 출력된 것입니다.
//해결책?
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
