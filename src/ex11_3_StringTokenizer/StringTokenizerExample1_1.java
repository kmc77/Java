package ex11_3_StringTokenizer;

//토큰 : 문자열 구성 단위
//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.
import java.util.StringTokenizer;

class StringTokenizerExample1_1 {
	public static void main(String[] agrs) {
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");

		String s1 = stok.nextToken();
		System.out.println(s1);

		String s2 = stok.nextToken();
		System.out.println(s2);

		String s3 = stok.nextToken();
		System.out.println(s3);

		// 런타임 에러 발생-추출할 토근이 더 이상 없음
		String s4 = stok.nextToken();
		System.out.println(s4);
		System.err.println("=============================");
	}

}
