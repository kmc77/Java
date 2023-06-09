package ex12_1_Exception;
import java.io.*;
//익섹션 파라미터의 타형성을 보여주는 예
//익셉션 처리하지 않아서 컴파일 오류 발생했습니다.
class ExceptionEcample8 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
