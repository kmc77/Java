package ex05_7_continue;

public class ContinueExample1 {

	public static void main(String[] args) {
		//0부터 9까지 1씩 증가되는 출력문 작성
		//단. 5는 출력하지 않는다.
		
		for (int cnt = 0; cnt < 10; cnt++) {
			if ( cnt != 5) //5일 때 넘어간다
				System.out.println(cnt);
		}
		System.out.println("====================");
		
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5) //5일 때 넘어간다
				continue;
			
			System.out.println(cnt);
		}
		
		System.out.println("End.");

	}

}
