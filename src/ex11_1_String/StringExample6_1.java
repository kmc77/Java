package ex11_1_String;

//문자열 추출 메서드
//substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
//substring(int beginIndex, int endIndex) : beginIndex부터 endIndex -1 까지 부분 문자열 리턴 
/*
 출력결과)
 추출한 숫자는 4이고 여자입니다.
 
 단, if문과 substring() 이용합니다.
 */
public class StringExample6_1 {

	public static void main(String[] args) {
		String jumin = "123456-4123456";

		String s = jumin.substring(7, 8); // substring(n1,n2); n1부터 n2-1까지 추출
		System.out.println("추출한 숫자는 " + s + "이고 ");

		if (s.equals("1") || s.equals("3")) {
			System.out.println("남자입니다.");
		} else if (s.equals("2") || s.equals("4")) {
			System.out.println("여자입니다.");
		}

	}

}
