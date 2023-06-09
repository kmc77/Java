package ex05_5_for;

public class ForExample4_7calendar4 {

	public static void main(String[] args) {
		System.out.println("============ 2023년 05월 ============");
		for (int i = 0; i <= 31; i++) {
			
			if (i <= 0) {
				System.out.printf("%5s", " ");
			} else {
				System.out.printf("%5d", i); //5자리를 차지하고 오른쪽정렬
			}
			
			if (i % 7 == 6)
				System.out.println();
		}
		
		System.out.println("\n============ 2023년 06월 ============");
		for (int i = -3; i <= 30; i++) { //시작과 끝지점 파악
			
			if (i <= 0) {
				System.out.printf("%5s", " "); //0까지 빈공간 출력
			} else {
				System.out.printf("%5d", i);  //그렇지 않은 공간 숫자 출력
			}
			
			if (i % 7 == 3) //줄바꿈 지점
				System.out.println();

	}

}
}
