package ex20_4.client;
//메시지를 수신하는 스레드 클래스
import java.io.*;
import java.net.*;

class ReceiverThread extends Thread {

	private Socket socket;

	ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {
				String str = reader.readLine();
				if (str == null)
					break;
				// 수신된 메시지를 모니터로 출력합니다.
				System.out.println(str); //수정 "수진>" 없어요
			}
		} catch (Exception e) {
			
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}