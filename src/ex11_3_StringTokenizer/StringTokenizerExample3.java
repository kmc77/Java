package ex11_3_StringTokenizer;

//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
//두 종류 이상의 구분 문자를 기준으로 토큰을 구분합니다.
import java.util.StringTokenizer;

class StringTokenizerExample3 {
	public static void main(String[] agrs) {

		// 구분자-콤마(,)와 수직선 (|)
		StringTokenizer stok = new StringTokenizer("사과,배|복숭아", ",|");

		while (stok.hasMoreElements()) { // 토큰이 있는 동안 반복해라
			String str = stok.nextToken(); // 문자열로부터 토큰을 추출
			System.out.println(str);
		}
	}

}
