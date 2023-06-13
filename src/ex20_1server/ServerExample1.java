package ex20_1server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerExample1 {

	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.~");

		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 서버 소켓을 연결 요청을 기다리다가
			// 연결 요청이 오면 연결을 맺고 또 다른 소켓을 생성합니다.
			serverSocket = new ServerSocket(9000);// 서버 소켓을 생성합니다.

			// accept() 메서드 : 서버 소켓으로 연결 요청이 들어오면 연결을 맺고
			// 클라이언트 소켓을 생성해서 리턴하는 메서드
			socket = serverSocket.accept();

			// 데이터 수신에 사용할 입력 스트림 객체를 리턴하는 메서드
			InputStream in = socket.getInputStream();

			// 데이터 송신에 사용할 출력 스트림 객체를 리턴하는 메서드
			OutputStream out = socket.getOutputStream();

			byte arr[] = new byte[128];
			in.read(arr);// 데이터를 수신합니다.
			// 수신된 데이터를 출력합니다.
			System.out.println(new String(arr));

			String str = "Hello, Client";

			// getBytes() 메서드는 문자열을 바이트 배열로 만드는 메서드입니다.
			out.write(str.getBytes()); // 데이터를 송신합니다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); // 소켓을 닫습니다.
			} catch (Exception ignored) {
				System.out.println("소켓 닫는 중 에러입니다.");
			}
			try {
				serverSocket.close(); // 서버 소켓을 닫습니다.
			} catch (Exception ignored) {
				System.out.println("서버 소켓 닫는 중 에러입니다.");
			}
		}
	}
}
