package ex19_04_Serialization_transient_no;

//BBSItem 객체를 직렬화하는 프로그램
import java.io.FileOutputStream;
import java.io.*;

public class ObjectOutputExample2 {

	public static void main(String[] args) {

		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("홍길동", "HTA-L3", "7월 모임", "집에서 할 수 있는 취미");
			System.out.println(obj);

			out.writeObject(obj); // 객체를 직렬화하는 부분

		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				out.close(); // 3. 파일을 닫습니다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // finally end

	} // main end
} // class end
