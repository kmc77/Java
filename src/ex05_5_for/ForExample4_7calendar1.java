package ex05_5_for;

public class ForExample4_7calendar1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 31; i++) {
			System.out.printf("%5d", i); //5자리를 차지하고 오른쪽정렬
			if (i % 7 == 0)
				System.out.println();
		}

		System.out.println("\n============ 2023년 05월 ============");

		for (int i = 1; i <= 31; i++) {
			System.out.printf("%-5d", i); //5자리를 차지하고 왼쪽정렬
			if (i % 7 == 0) {
				System.out.println();

			}
		}
	}
}
