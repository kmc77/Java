package ex18_1_FileReader;

import java.io.*;

class FileReaderExample3_1 {

	public static void main(String[] args) {
		// reader 변수를 finally 문에서 사용하기 위해 try문 전에 선언
		FileReader reader = null;
		try {
			reader = new FileReader("poem.txt");
			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메서드
				int data = reader.read();
				if (data == -1) // 더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				reader.close(); // 파일을 닫는 명령문
			} catch (IOException e) {
				System.out.println("IOException");
			}

		}

	}
}
