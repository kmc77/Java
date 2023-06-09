package ex07_15_static_method;
// 정적 메서드 호출하는 프로그램
class StaticMethodExample2 {

	public static void main(String[] args) {
		
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계 = " + grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		
		// 정적 메서드 호출문
		grandTotal = Accumulator.getGrandTotal();
		
		StaticMethodExample2 s = new StaticMethodExample2();
		s.print(obj1);
		s.print(obj2);
		System.out.println("총계 = " + grandTotal);

	} // main() end

	void print(Accumulator a) {
		System.out.println("total = " + a.total);

	} 

}
