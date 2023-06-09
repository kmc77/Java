package ex18_1_FileReader;

import java.io.*;

class FileReaderExample2_1 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("poem.txt");
//		FileReader reader = new FileReader("D:/eclipse-workspace/Java/poem.txt");
//		FileReader reader = new FileReader("D:\\eclipse-workspace\\Java\\poem.txt");
			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메서드
				int data = reader.read();
				if (data == -1) // 더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close(); // 만약 read() 메서드에서 오류가 발생하면
							// close()메서드가 실행 되지 않는 채 프로그램이 끝납니다.
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // read() 메서드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		}

	}

}
