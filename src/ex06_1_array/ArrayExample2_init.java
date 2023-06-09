package ex06_1_array;

public class ArrayExample2_init {

	public static void main(String[] args) {

		int[] arr = new int[10]; // 배열 생성

		System.out.println("================for문 이용================");
		for (int i = 0; i <= 10; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		System.out.println("================length 이용================");
		for (int i = 0; i <= arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);

		}

	}
}
