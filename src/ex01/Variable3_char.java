package ex01;

public class Variable3_char {
	public static void main(String[] atgs) {

		System.out.println("===========문자형 변수===========");
		// 문자형 변수 - 하나의 문자를 나타낼 수 있는 자료형으로
		// 16비트의 유니코드를 사용합니다.
		char c1 = 'A';
		char c2 = '@';
		char c3 = '가';
		System.out.println("c1=" + c1 + " c2=" + c2 + " c3=" + c3);

		/*
		 * 에러의 예 1. char cerror='AB'; 두 글자 입력하면 에러 2. char cerror_b1ank=''; 반드시 하나의 문자가
		 * 필요
		 */

		/*
		 * 컴퓨터가 숫자밖에 모르기 때문에 문자가 숫자로 변환되어 저장되는데 어떤 기준으로 저장할까요? 문자에 해당하는 유니고드입니다. 'A' ->
		 * 65 : 문자를 코드로 변환하는 것을 문자 인코딩(encoding)이라고 합니다. 65 -> 'A' : 코드를 문자로 변환하는 것을 문자
		 * 디코딩(decoding)이라고 합니다.
		 */
		// 문자형에 정수를 배정하면 정수에 해당하는 유니코드를 찾아서
		// 변수에 저장합니다.
		char c4 = 65; // 영문 'A' 를 의미
		char c5 = '\uAC00'; // 한글 유니코드 '가'를 의미
		System.out.println("c4=" + c4 + " c5=" + c5);

	}

}
