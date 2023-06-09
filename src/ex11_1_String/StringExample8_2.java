package ex11_1_String;

public class StringExample8_2 {

	public static void main(String[] args) {
		String message = "Java program creates many objects.";

		// 지정된 문자가 최초로 위치한 인덱스를 구합니다.존재하지 않는 경우 =1를 리턴합니다.
		// 문자열 뒤에서 부터 검색합니다.
		int index1 = message.lastIndexOf('a');
		System.out.println("a의 위치는 " + index1);

		// 아스키코드 97은 소문자 'a'
		int index2 = message.lastIndexOf(97);
		System.out.println("a의 위치는 " + index2);

		// 아스키코드 65은 대문자 'A'
		int index23 = message.lastIndexOf(65);

		// 'A'가 없을 때는 index 값은 -1 을 반환합니다.
		System.out.println("A의 위치는 " + index23);

		// index번호 13번째 부터 역순으로 'a'를 찾습니다.
		int index3 = message.lastIndexOf('a', 13);
		System.out.println("13번 부터 a의 위치는 " + index3);

		// "av" 의 시작 index를 찾습니다.
		int index4 = message.indexOf("av");
		System.out.println("av로 시작하는 index는 " + index4);

	}
}