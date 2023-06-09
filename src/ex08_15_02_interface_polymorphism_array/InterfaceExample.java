package ex08_15_02_interface_polymorphism_array;

class InterfaceExample {

	public static void main(String[] args) {
		// int[] a = new int[3];
		// String[] a = new String[3];

		Lendable[] arr = new Lendable[3]; // 인터페이스 타입의 배열

		// 배열에 여러 타입의 객체 주소 저장
		arr[0] = new SeparateVolume("882o", "푸코의 진자", "에코");
		arr[1] = new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo("02-17", "마이크로서비스를 위한 자바 프로그래밍", "유시진");

		checkOutAll(arr, "홍길동", "2023-05-17");

	}

	static void checkOutAll(Lendable[] arr, String borrower, String date) {
		for (Lendable a : arr) {
			a.checkOut(borrower, date);
		}

	}

}
