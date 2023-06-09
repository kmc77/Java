package ex07_14_static_field1;
//상수 필드 선언을 포함하는 클래스
class LimitedValue {
	
		//final 과 static 위치 버뀌어도 됩니다.
		//final static int UPPER_LIMIT = 100000; //상수 필드의 선언
		static final int UPPER_LIMIT = 100000;
		int value;
		
		void setValue(int value) {
			if (value < UPPER_LIMIT)
				this.value = value;
			else 
				this.value = UPPER_LIMIT; // 상수 필드의 사용
	}

}
