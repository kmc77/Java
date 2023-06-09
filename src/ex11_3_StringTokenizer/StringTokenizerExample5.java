package ex11_3_StringTokenizer;

//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램

import java.util.StringTokenizer;

class StringTokenizerExample5 {
	public static void main(String[] agrs) {

		// 구분자-콤마(,)와 수직선 (|)
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);

		System.out.println("상품이름\t상품 수");

		while (stok.hasMoreElements()) {
			String token = stok.nextToken();
			if (token.equals("=")) {
				System.out.print("\t");
			} else if (token.equals("|")) {
				System.out.print("\n");
			} else {
				System.out.print(token);
			}
		}
	}

}
