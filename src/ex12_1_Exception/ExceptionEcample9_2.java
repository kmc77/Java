package ex12_1_Exception;

import java.io.*;

//상속 관계에 있는 두 종류의 Exception을 처리하는 try문
//ExceptionExample9_1의 catch문 변경 예 - 에러 발생
//catch문 예외 순서가 부모가 자식보다 먼저와서 에러 발생
//FileNotFoundException -> IOException
class ExceptionEcample9_2 {

	public static void main(String[] args) {

		FileReader reader = null;
		try {
			reader = new FileReader("some.txt");
		} catch (Exception e) {
			System.err.println("입출력 에러가 발생했습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
