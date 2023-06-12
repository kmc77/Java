package ex18_06_Buffered3_sort_student;

import java.util.ArrayList;

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

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return Math.round(getTotal() / 3.0 * 10) / 10.0f;

	}

	@Override
	public String toString() {
		return (name + "\t" + kor + "\t" + math + "\t" + eng + "\t" + getTotal() + "\t" + getAverage());
	}

//학생별 총점을 기준으로 정렬하기
	static void sort(ArrayList<Student2> as) {
		for (int i = 0; i < as.size() - 1; i++) {
			for (int j = i + 1; j < as.size(); j++) {
				if (as.get(i).getTotal() < as.get(j).getTotal()) { // 오름, 내림 차순
					Student2 imsi = as.get(i);
					as.set(i, as.get(j));
					as.set(j, imsi);

				}

			}
		}
	}
}
