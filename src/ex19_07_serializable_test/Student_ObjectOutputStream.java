package ex19_07_serializable_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Student_ObjectOutputStream {

	public static void main(String[] args) {
		write();

	}

	static void write() {
		BufferedReader reader = null;
		ObjectOutputStream out = null;

		try {
			reader = new BufferedReader(new FileReader("src/ex19_07_serializable_test/jumst.txt"));
			out = new ObjectOutputStream(new FileOutputStream("src/ex19_07_serializable_test/output.dat"));

			while (true) {
				String str = reader.readLine(); // 파일로부터 한 행씩 읽어요.
				if (str == null)
					break;
				String[] sep = str.split(" ");
				out.writeObject(new Student2(sep[0], Integer.parseInt(sep[1]), Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])));

			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				reader.close(); // 파일을 닫는 명령문
			} catch (Exception e) { // close메서드가 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}

			try {
				out.close();
			} catch (Exception e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}

	static void print(ArrayList<Student2> list) {
		System.out.println("=========== 학생별 / 과목별 총점구하기 ===========");
		System.out.println("\n이름\t국어\t수학\t영어\t총점\t평균");

		for (Student2 obj : list) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.print(Student2.korTotal + "\t");
		System.out.print(Student2.mathTotal + "\t");
		System.out.print(Student2.engTotal + "\t");

	}

}
