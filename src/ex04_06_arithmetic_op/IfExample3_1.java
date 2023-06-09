package ex04_06_arithmetic_op;

public class IfExample3_1 {

	public static void main(String[] args) {
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;

		if (num1 > num2) { // 중첩 if문
			if (num1 > num3)
				System.out.println("num1이 제일 큽니다.");
		}
			if (num1 > num2 && num1 > num3) { // 중첩 if문
				System.out.println("num1이 제일 큽니다.");
			}
		}
	}
