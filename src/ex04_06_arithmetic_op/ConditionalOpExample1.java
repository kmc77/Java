package ex04_06_arithmetic_op;
//조건 연산자
public class ConditionalOpExample1 {

	public static void main(String[] args) {
		int a = 30, b = 10, max; //최댓값
		
		System.out.println(a > b ? a : b); 
		
		max = a > b ? a : b; // a > b 가 참일시 a 값을 max에 대입한다.
		System.out.println("최댓값 = " + max);
		
		
		int c = 20, d = 30, min; //최소값
		
		System.out.println(c < d ? c : d);
		
		min = c < d ? c : d;
		System.out.println("최솟값 = " + min);
	}

}
