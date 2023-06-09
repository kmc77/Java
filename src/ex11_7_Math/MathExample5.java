package ex11_7_Math;
/*
 1~45까지 난수 6개를 순서대로 발생하는 프로그램
 
 난수 발생 공식
 난수 = (정수화)((상한값-하한값+1)*난수+하한값)
 
 
 1. choice : 6개의 난수를 중복 없이 배열 num에 저장합니다.
 2. sort : 배열 num을 오름차순 정렬합니다.
 3. print : 배열 num을 순차적으로 출력합니다.
 */

public class MathExample5 {

	public static void main(String[] args) {

		int num[] = new int[6]; // 중복된 데이터 확인하기
		choice(num);
		print(num); // 향상된 for문
		System.out.println("\n=========정렬 후=========");
		sort(num);
		print(num);
	}

	static void choice(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				} // if end
			} // for end
		} // for end
	}

	static void sort(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int imsi = num[i];
					num[i] = num[j];
					num[j] = imsi;

				}
			}

		}

	}

	static void print(int[] num) {

		for (int data : num) {
			System.out.print(data + "  ");

		}

	}

}
