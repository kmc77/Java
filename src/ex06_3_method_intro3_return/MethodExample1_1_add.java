package ex06_3_method_intro3_return;

public class MethodExample1_1_add {

		
		public static void main(String[] args) {
			
			int restlt = add(3, 4);
			System.out.println(restlt);
		
	}
		public static int add(int num1, int num2) {
			int sum;
			sum = num1 + num2;
			return sum;
		}

}
