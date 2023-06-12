package ex18_2_FileWriter;

//FileWriter 클래스를 이용해서 문자 데이터를 파일에 쓰는 프로그램
import java.io.*;

public class FileWriterExample3_gugudan {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/ex18_02_FileWriter/gugudan.txt"); // 파일을 연다.

			// 단 title출력
			for (int dan = 2; dan <= 9; dan++) {
				writer.write("[" + dan + "단]" + "\t");
			}

			for (int i = 1; i <= 9; i++) {
				writer.write("\n");
				for (int j = 2; j <= 9; j++) {
					writer.write(j + "*" + i + "=" + (j * i) + "\t");
				}
			}

		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				writer.close(); // 파일을 닫습니다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
