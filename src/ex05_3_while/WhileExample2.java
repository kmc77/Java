package ex05_3_while;

public class WhileExample2 {

	public static void main(String[] args) {
		System.out.println("======홀수출력=====");
		int i = 1; //초기값
		while (i <= 10) { //최종값
			System.out.println(i);
			i = i + 2;

	}
		System.out.println("======짝수출력=====");
		i = 2; 
		while (i <= 10) { 
			System.out.println(i);
			i = i + 2;
			
	}		
		System.out.println("======합 출력=====");
		int sum = 0;
		int a = 0; //a = 1이면 증강 연산자 빠짐
		while (++a <= 10) {
			sum += a;
			//a = a + 1;
	}
		System.out.println(sum);
		
		System.out.println("======홀수 합 출력=====");
		sum = 0;
		int b = 1; 
		while (b <= 10) { 
			sum += b;
			b += 2;
			
	}
		System.out.println(sum);
		
		System.out.println("======홀수 합 출력=====");
		sum = 0;
		int c = 2; 
		while (c <= 10) { 
			sum += c;
			c += 2;
	}
		System.out.println(sum);	
		
		
  }
}
  
  
