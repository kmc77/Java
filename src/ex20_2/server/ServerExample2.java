package ex20_2.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ServerExample2 {

	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.~");

		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);// 서버 소켓을 생성합니다.
			socket = serverSocket.accept();
			
			/*
			 IuputStreamReader 클래스 :
			 	바이트 스트림을 문자 스트림으로 바꾸어주는 클래스
			 	이 클래스의 생성자에 소켓으로부터 얻은 InputStream 객체를 넘겨 주면
			 	네트워크로 수신된 데이터를 문자 스트림 형태로 읽을 수 있느
			 	IuputStreamReader 객체가 생성됩니다.
			 */
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			/*
			 PrintWriter 클래스를 이용하여 문자 스트림을 바이트 스트림으로 바꾸어서
			 출력하기 위해서는 이 클래스의 생성자에 OutputStream 타입의 객체를 파라미터로
			 넘겨주어야 합니다.
			 */
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			// 데이터를 수신합니다.
			String str = reader.readLine();

			//데이터를 화면에 출력합니다.
			System.out.println(str);

			writer.println("Hello, Client2");
			
			/*
			 PrintWriter 클래스의 println() 메서드로 문자열을 출력하면 그 문자열이
			 메서드 호출 즉시 네트워크로 송신되는 것이 아니라 버퍼가 다 찰 때까지 모아졌다가
			 한꺼번에 송신됩니다.
			 그래서 println() 메서드를 호출한 다음에 바로 문자열이 송신되도록 하려면
			 flush메서드를 호출해야 합니다.
			 */

			writer.flush();

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
			} // catch
		} // finally
	} // main
} // class
