package ex07_test_02_static;

public class Student {

	String name;
	int kor;
	int math;
	int eng;
	static int korTotal; // korTotal(국어 총합),
	static int mathTotal; // mathTotal(수학 총합)
	static int engTotal; // engTotal(영어 총합)
	

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;

	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (getTotal() / 3f);

	}
}
