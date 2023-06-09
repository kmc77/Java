package ex11_1_String;

//charAt() 메서드를 사용하여 주민번호 뒷자리 추출 예
//if문 사용
public class StringExample6_3 {

	public static void main(String[] args) {
		String jumin = "123456-4123456";
		char ch = jumin.charAt(7);
		System.out.println("추출한 숫자는 " + ch + "이고 ");

		if (ch == '1' || ch == '3') {
			System.out.println("남자입니다.");
		} else if (ch == '2' || ch == '4') {
			System.out.println("여자입니다.");
		} else
			System.out.println("외국인입니다.");

	}

}
