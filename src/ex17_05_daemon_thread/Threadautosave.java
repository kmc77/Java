package ex17_05_daemon_thread;
/*
 	스레드는 일반 스레드와 데몬 스레드로 나뉩니다.
 	
 	데몬 스레드(daemon thread) 는 다른 일반 스레드(데몬 스레드가 아닌 스레드) 의
 		작업을 돕는 보조적인 역할을 수행하는 스레드입니다.
 		일반 스레드가 모두 종료되면 데몬 스레드는 강제적으로 자동 종료됩니다.
 		데몬 스레드는 일반 스레드의 보조 역할을 수행하므로 일반 스레드가 모두 종료되고 나면
 		데몬 스레드의 존재의 의미가 없기 때문입니다.
 		이 점을 제외하고는 데몬 스레드와 일반 스레드는 다르지 않습니다.
 		데몬 스레드의 예로는 가비지 컬렉터, 워드프로세서의 자동저장, 미디어 플레이어의 동영상 및 음악재생 등이 있습니다.
 		이 기능들은 주 스레드 JVM, 워드프로세서, 미디어 플레이어가 종료되면 같이 종료됩니다.
 		
 		데몬 스레드는 무한루프와 조건문을 이용해서 실행 후 대기하고 있다가 특정 조건이 만족되면
 		작업을 수행하고 다시 대기하도록 작성합니다.
 		
 		데몬 스레드 사용법
 			스레드 생성 -> 반드시 SETdAEMON(TRUE)메서드 호출 -> start() 메서드 호출
 			void setDaemon(boolean on) : true(데몬 스레드로 설정), false(일반 스레드로 설정)
 			
 */
class Threadautosave implements Runnable {
	static boolean autoSave = false;

	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if (autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
