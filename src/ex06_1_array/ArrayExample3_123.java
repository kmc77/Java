package ex06_1_array;

public class ArrayExample3_123 {

	public static void main(String[] args) {

		System.out.println("========= 방법 1 =========");

		int[] arr = new int[5]; // 배열 생성
		// 배열 사용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("arr[0]=" + arr[0]);
		System.out.println("arr[1]=" + arr[1]);
		System.out.println("arr[2]=" + arr[2]);
		System.out.println("arr[3]=" + arr[3]);
		System.out.println("arr[4]=" + arr[4]);

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		}

		System.out.println("========= 방법 2 ========="); // 배열 선언과 생성과 초기화

		int arr1[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		}

		System.out.println("========= 방법 3 ========="); // 배열 선언과 생성과 초기화

		int arr2[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		}

	}
}
