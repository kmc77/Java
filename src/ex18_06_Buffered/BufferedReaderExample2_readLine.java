package ex18_06_Buffered;

import java.io.*;

public class BufferedReaderExample2_readLine {

	public static void main(String[] args) {

		BufferedReader reader = null;
		String message = null;

		try {
			reader = new BufferedReader(new FileReader("src/ex18_06_Buffered/output2.dat"));

			while ((message = reader.readLine()) != null) { // 더 이상 데이터가 없는 경우 null을 리턴합니다.
				System.out.println(message);
			}

		} catch (FileNotFoundException fnfe) { // Exception - IOException
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				reader.close(); // 파일을 닫는 명령문
			} catch (Exception e) { // close메서드가 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}

}
