package ex04_06_arithmetic_op;

public class LogicalExample5_1 {

	public static void main(String[] args) {
		System.out.println(!true);
		System.out.println(!false);
		
		int a = 3, b = 4;
		
		if (a >= b) { // 조건이 거짓이기 때문에 출력안됨
			System.out.println(a + ">=" + b);
		}
		
		if (!(a>=b)) {
			System.out.println(a + "<" + b);
		}
	}

}
