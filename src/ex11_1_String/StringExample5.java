package ex11_1_String;

//문자열의 내용을 비교하는 equals메서드
public class StringExample5 {

	public static void main(String[] args) {
		String str1 = new String("자바");
		String str2 = new String("자바");

		if (str1.equals(str2))
			System.out.println("str1.equals(str2) 같음");
		else
			System.out.println("str1.equals(str2) 다름");

	}

}
