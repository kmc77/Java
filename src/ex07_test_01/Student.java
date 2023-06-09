
package ex07_test_01;

public class Student {
	
	String name;
	int kor, eng, math;
	
	/*static
	 int korTotal(국어 총합), mathTotal(수학 총합), engTotal(영어 총합)
	 */
	//과목별 총합을 구합니다. 힌트
	
	
	Student (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	
	int getTotal() {  
		return kor + eng + math;
		
	}

	
	
	float getAverage() {
			return  (getTotal() / 3f) ;
	}
	
}





