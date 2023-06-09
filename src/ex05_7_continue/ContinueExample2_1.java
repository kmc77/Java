package ex05_7_continue;

//continue 잘 못 사용된 예
public class ContinueExample2_1 {

	public static void main(String[] args) {
		int cnt = 0;
		while (cnt < 10) {
			if (cnt == 5)
				continue; // 무한 루프에 빠짐
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("끝.");

	}

}
