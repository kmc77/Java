package ex01;

public class Literal3_escape {
	public static void main(String[] args) {
		
		/* 문자열 안에서 특수 문자를 표현하는 문자 리터널 - 제어문자(escape character)
		 * (1) teb      - \t
		 * (2) new line - \n
		 * (3) 역슬래쉬    - \\
		 * (4) 큰따옴표    - "
		 */
		
		System.out.println("호호하하"); // 큰따옴표
		System.out.println("\"호호하하\""); // 큰따옴표
		System.out.println("호호\n하하\n"); // new line
		System.out.println("호호하하%n"); // 큰따옴표
		System.out.println("호호\t하하"); // teb
		System.out.println("호호\\하하"); // 역슬래쉬
		
		
	}
}