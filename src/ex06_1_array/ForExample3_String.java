package ex06_1_array;

public class ForExample3_String {

	public static void main(String[] args) {
		String arr[] = {"홍길동", "이순신", "세종대왕"};
		
		//향상된 for문, 확장 for문 (jdk 1.5이상)
		for (String num : arr) {
			System.out.println(num);
		}
		
	}

}
