package ex18_10_File;

import java.io.File;

//File 클래스를 이용하여 파일, 디렉토리 생성 및 삭제 변경
public class FileExample2_4 {

	public static void main(String[] args) {
		//디렉토리 삭제
		/*
		 boolean java.io.File.delete() : 디렉토리 삭제합니다.
		 단 디렉토리 안에 파일이 있으면 삭제하지 못합니다.
		 이때 반환값은 false가 됩니다.
		 */
		File f4 = new File("D:\\newDirectory");
		// 파일 삭제
		if (!f4.exists()) // C:\\newDirectory 디렉토리가 없는 경우
			if (f4.delete()) { // 디렉토리 삭제
				System.out.println(f4.getPath() + " 삭제했습니다.");
			} else {
				System.out.println(f4.getPath() + " 삭제 하지 못했습니다.");

			}
		else { // D://newDirectory 디렉토리가 있는 경우
			System.out.println(f4.getPath() + "에 삭제하고자 하는 디렉토리가 없습니다.");

		}
	}
}
