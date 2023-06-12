package ex18_06_Buffered3_sort_student;

import java.io.*;

//https://dololak.tistory.com/84 그림 살펴보세요~
public class BufferedWriterExample1_write {

	public static void main(String[] args) {
		String message = "이승기 100 70 80\n"+
				"강호동 98 100 20\n"+
				"윤하하 50 60 78\n"+
				"유재석 80 70 80\n"+
				"홍길동 80 80 80";

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_06_Buffered3_sort_student/jumst.txt"));
			writer.write(message);
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				writer.close(); // 파일을 닫는 명령문
			} catch (Exception e) { // close메서드가 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}

}
