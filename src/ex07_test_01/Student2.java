
package ex07_test_01;

public class Student2 {
	
	String name;
	int kor, eng, math;
	
	
	Student2 (String name, int kor, int eng, int math) {
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





