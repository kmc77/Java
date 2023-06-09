package ex06_1_array;

public class TwoArrayExample2_String {

	public static void main(String[] args) {
		String arr[][] = {
						 {"과일", "사과"},
						 {"아이스크림", "메로나"},
						 {"커피"}
		                };
		
		
		for (String n : arr[0]) {
				System.out.println(n);
		}
		System.out.println("=======================");
		
		for (String[] n : arr) {
			for (String a : n) {
				System.out.printf("%s\t", a);
				System.out.println();
			}
			System.out.println("End.");

	}
  }
}
