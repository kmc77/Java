package ex19_07_serialVersionUID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//객체를 역직렬화하는 프로그램
/*
 	프로그램에 입력된 스트림으로 부터 다시 객체를 만들어 내는 작업을 역직렬화(deserialization)라고 합니다.
 */

public class ObjectInputExample3 {

	public static void main(String[] args) {
		/*
		 * 1. 파일을 엽니다. ObjectOutputStream 클래스는 객체를 스트림으로 만들어서 출력하는 기능이 있는 클래스입니다. 이
		 * 클래스에는 데이터를 파일에 저장하는 기능이 없기 때문에 FileOutputStream 클래스와 함께 사용해야 합니다.
		 * FileOutputStream 객체를 생성해서 ObjectOutputStream 클래스의 생성자 파라미터로 넘겨주어야 합니다.
		 */

		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));

			Rectangle obj = (Rectangle) in.readObject();
			System.out.println("***역질렬화 합니다.***");
			System.out.println(obj);

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일을 존재하지 않습니다..");

		} catch (IOException ioe) {
			// 직렬화할 때 사용한 클래스와 역직렬화할 때 사용한 클래스의 버전이
			// 다를 때 발생하는 에러 메시지 출력하는 곳
			System.out.println(ioe.getMessage());

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close(); // 3. 파일을 닫습니다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
