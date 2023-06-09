package ex05_4_do_while;


public class DoWhileExample2_3 {

	public static void main(String[] args) {
		System.out.println("==1씩증가==");
		int i = 1;
		do {
			System.out.println(i);
			i += 1;
		    
		} while (i <= 10);
		
		System.out.println("==홀수출력==");
		i = 1;
		do {
			System.out.println(i);
		} while (i <= 10);
		
		System.out.println("==짝수출력==");
		i = 2;
		do {
			System.out.println(i);
		} while (i <= 10);
		
		System.out.println("==1~10까지의 합==");
		int sum = 0;
		i = i;
		do {
			sum += i;
			i += 1;
		} while (i <= 10);
		System.out.println("1~10까지의 홀수의 합 = " + sum);
		
		System.out.println("==짝수 합 구하기==");
		sum = 0;
		i = 2;
		do {
			sum += i;
			i += 2;
		} while (i <= 10);
		System.out.println("1~10까지의 짝수의 합 = " + sum);
	}

}



