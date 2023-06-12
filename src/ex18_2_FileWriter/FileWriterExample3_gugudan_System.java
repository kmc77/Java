package ex18_2_FileWriter;

//FileWriter 클래스를 이용해서 문자 데이터를 파일에 쓰는 프로그램

public class FileWriterExample3_gugudan_System {

	public static void main(String[] args) {

		// 단 title출력
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("[" + dan + "단]" + "\t");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 2; j <= 9; j++) {
				System.out.println(j + "*" + i + "=" + (j * i) + "\t");
			}
		}
	}
}
