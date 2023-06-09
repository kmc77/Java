package ex05_5_for;

public class ForExample4_Test {

	public static void main(String[] args) {
		System.out.println("====1~10 홀수출력====");

		for (int i = 0; i < 10; i++) {
			i += 1;
			System.out.println(i);
		}

		System.out.println("====1~10 짝수출력====");

		for (int i = 1; i <= 10; i++) {
			i += 1;
			System.out.println(i);
		}

		System.out.println("====1~10 합 출력====");

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("====1~10 홀수의 합 출력====");

		sum = 0;
		for (int i = 0; i < 10; i++) {
			i += 1;
			sum += i;
		}
		System.out.println(sum);

		System.out.println("====1~10 짝수의 합 출력====");

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			i += 1;
			sum += i;
		}
		System.out.println(sum);

	}

}
