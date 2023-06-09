package ex07_14_static_field1;
//상수 필드 선언을 포함하는 클래스
class StaticFieldExample2 {
	public static void main(String[] args) {

		System.out.println("상한값 = " + LimitedValue.UPPER_LIMIT);

		LimitedValue v = new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value = " + v.value);

		System.out.println("정수의 상한값 = " + Integer.MAX_VALUE);
		System.out.println("정수의 하한값 = " + Integer.MIN_VALUE);

	}
}