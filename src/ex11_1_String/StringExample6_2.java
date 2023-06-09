package ex11_1_String;

//문자열 추출 메서드
//substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
//substring(int beginIndex, int endIndex) : beginIndex부터 endIndex -1 까지 부분 문자열 리턴 
/*
	switch ~ case 문 사용
 */
public class StringExample6_2 {

	public static void main(String[] args) {
		String jumin = "123456-5123456";

		String s = jumin.substring(7, 8); // substring(n1,n2); n1부터 n2-1까지 추출
		System.out.println("추출한 숫자는 " + s + "이고 ");

		switch (s) {
		case "1":
		case "3":
			System.out.println("남자입니다.");
			break;

		case "2":
		case "4":
			System.out.println("여자입니다.");
			break;
			
		default:
			System.out.println("외국인입니다.");
		}

	}
}
