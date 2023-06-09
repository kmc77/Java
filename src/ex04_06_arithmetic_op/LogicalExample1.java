package ex04_06_arithmetic_op;

public class LogicalExample1 {

	public static void main(String[] args) {
		boolean a = 4 > 3;
		boolean b = 5 > 7;
		System.out.println("a = " + a); // true
		System.out.println("b = " + b); // false

		if (a && b) { //
			System.out.println("a&&b가 참");
		}

		if (a || b) {
			System.out.println("a||b가 참");
		}
		// true && true => true
		if (a == true && b == false) {
			System.out.println("a&&b가 참2");
		}
	}

}
