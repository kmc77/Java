package ex13_9student_toString;

public class Student2 {

	String name;
	int kor;
	int math;
	int eng;
	static int korTotal; // korTotal(국어 총합),
	static int mathTotal; // mathTotal(수학 총합)
	static int engTotal; // engTotal(영어 총합)

	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;

	}

	@Override
	public String toString() {
		return (name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t" + getAverage());
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return Math.round(getTotal() / 3.0 * 10) / 10.0f; // Math.round()를 이용해서 반올림 될 수 있도록 합니다.
	}

	public static void sort(Student2[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getTotal() < students[j].getTotal()) { // 오름, 내림 차순
					Student2 imsi = students[i];
					students[i] = students[j];
					students[j] = imsi;

				}
			}
		}

	}

}
