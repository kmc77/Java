package ex07_2_Exception;
//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생
class ExceptionEcample2_4 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 10;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
		} finally {
			System.out.println("여기까지 왔어요~");
		}

	}

}
