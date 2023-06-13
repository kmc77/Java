package ex19_07_serialVersionUID;

//Rectangle 객체를 직렬화하는 프로그램
import java.io.FileOutputStream;
import java.io.*;

public class ObjectOutputExample {

	public static void main(String[] args) {

		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100, 200);
			System.out.println(obj);

			out.writeObject(obj); // 객체를 직렬화하는 부분

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			try {
				out.close(); // 3. 파일을 닫습니다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // finally end

	} // main end
} // class end
