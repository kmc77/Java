package ex19_07_serializable_test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Student_ObjectInputStream {

	public static void main(String[] args) {
		input();
	}

	static void input() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("src/ex19_07_serializable_test/jumst.txt"));
			while (true) {
				Student2 s = (Student2) in.readObject();
				System.out.println(s.toString());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일을 존재하지 않습니다.");
		} catch (EOFException eofe) {
			System.out.println("끝");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close(); // 3. 파일을 닫습니다.
			} catch (Exception e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}

	}
}
