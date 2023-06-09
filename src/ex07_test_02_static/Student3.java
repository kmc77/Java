package ex07_test_02_static;

public class Student3 {

	String name;
	int kor;
	int math;
	int eng;
	static int korTotal; // korTotal(국어 총합),
	static int mathTotal; // mathTotal(수학 총합)
	static int engTotal; // engTotal(영어 총합)
	
	public Student3(String name, int kor, int eng, int math) {
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

	 void sort(Student3[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getTotal() < students[j].getTotal()) { // 오름, 내림 차순
					Student3 imsi = students[i];
					students[i] = students[j];
					students[j] = imsi;

				}
			}
		}

	}

}
	
		
	

