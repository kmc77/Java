package ex11_5_Calendar;

public class StringExample6_7_method5 {
	public static void main(String[] agrs) {

		String zumin = "123456-2345678";
		print(zumin);
	} //main end

	static void print(String zumin) {
		if (check_length(zumin)) {
			if (check_hyphen(zumin)) {
				int isNumber = isNumber(zumin);
				if (isNumber >= 0 && isNumber <= 5) {
					System.out.println("주민번호 앞자리를 숫자로 입력하세요");
				} else if (isNumber >= 7 && isNumber <= 13) {
					System.out.println("주민번호 뒷자리를 숫자로 입력하세요");
				} else if (isNumber == -1) {
					System.out.println(pandan_gender(zumin) + "입니다.");
				}
			} else {
				System.out.println("-을 앞자리 입력 후 넣어주세요");
			}
		} else {
			System.out.println("주민등록번호는 14자리 입니다.");
		}
	}

	static boolean check_length(String zumin) {
		return zumin.length() == 14;

	}

	static boolean check_hyphen(String zumin) {
		return zumin.substring(6, 7).equals("-");

	}

	static int isNumber(String zumin) {

		int index = -1;
		int len = zumin.length();

		for (int i = 0; i < len; i++) {

			if (i == 6)
				continue;

			char test = zumin.charAt(i);
			// if (!(zumin.charAt(i) >= '0' && zumin.charAt(i) <= '9')) {
			if (test < '0' || test > '9') {
				index = i;
				break;
			}
		}

		return index;
	}

	static String pandan_gender(String zumin) {
		String gender = zumin.substring(7, 8);
		String result = "외국인";
		switch (gender) {
		case "1":
		case "3":
			result = "남자";
			break;

		case "2":
		case "4":
			result = "여자";
		}
		return result;
	}

}
