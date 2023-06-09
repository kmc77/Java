package ex17_01_Thread_anonymous;
//알파벳과 숫자를 동시에 출력하는 멀티스레드 프로그램

/*
 JVM이 스레드에 할당하는 시간과 실행 순서는 하드웨어의 성능이나 시스템 환경에
 따라 달라 실행 결과는 매번 다른 결과가 나올 수 있습니다.
 
 	anonymous 클래스
 	1) 클래스의 이름 없이 객체를 정의하는 방법으로 만듭니다.
 	2) 클래스를 재사용하지 않고 1번만 사용하고자 할 때 이용합ㄴ디ㅏ.
 	3) 형식
 		1. 부모가 클래스인 경우
 					부모클래스 변수 = new 부모클래스() {
 				};
 			2. 부모가 인터페이스인 경우
 					부모인터페이스 변수 = new 부모인터페이스() {
 				};		
 */

class MultithreadExample0 {

	public static void main(String[] args) {
		// 익명이 자식 객체를 생성합니다.
		Thread thread = new Thread() {
			public void run() {
				for (int cnt = 0; cnt < 10; cnt++)
					System.out.print(cnt);
			}

		};// 쓰레드를 생성

		// thread를 실행시킵니다.
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
	}

}
