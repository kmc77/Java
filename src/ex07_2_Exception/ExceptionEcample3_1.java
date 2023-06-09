package ex07_2_Exception;
//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생
class ExceptionEcample3_1 {

	public static void main(String[] args) {
		try {
			int result = add(1, 2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	static int add(int a, int b) throws Exception {
		int result = a + b;
		if (result < 0 )
			throw new Exception("0보다 작아 에러 발생합니다.");
		System.out.println("나는 출력이 될까요?");
		return result;
	}

}
