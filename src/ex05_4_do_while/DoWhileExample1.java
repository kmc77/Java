package ex05_4_do_while;

public class DoWhileExample1 {

	public static void main(String[] args) {
		int cnt = 1;
		do {
			System.out.println(cnt); // 1 2 ... 9 10
		} while (cnt++ < 10);   // 1<10 2<10 ... 9<10 10<10
		//비교하고 증강 연산자 적용
		System.out.println("끝");
	}

}
