package ex04_06_arithmetic_op;

public class EqualityExample1 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2 + 3;
		
		System.out.println(num1 == num2); //true
		System.out.println(num1 != num2); //false
		
		if (num1 == num2) {
			System.out.println("num1과 num2의 값은 동일합니다.");	
		} 
		
		if (num1 != num2) {
			System.out.println("num1과 num2의 값은 같지 않습니다.");
			
		}
	}

}
