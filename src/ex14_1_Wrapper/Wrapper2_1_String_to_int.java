package ex14_1_Wrapper;

//문자열로 입력된 값을 연산 처리하기 위한 방법?
public class Wrapper2_1_String_to_int {

	public static void main(String[] args) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			// 에러 발생(String -> int 형변환 요구)
			total = Integer.valueOf(args[cnt]) + total;
			System.out.print(args[cnt] + "\n");
		}
		
		System.out.println();
		System.out.print("args[0]=" + args[0] + "\n");
		System.out.print("args[1]=" + args[1] + "\n");
		System.out.print("args[2]=" + args[2] + "\n");
		System.out.print("args[3]=" + args[3] + "\n");
		System.out.print("args[4]=" + args[4] + "\n");

		System.out.println("합 = " + total);
	}

}
