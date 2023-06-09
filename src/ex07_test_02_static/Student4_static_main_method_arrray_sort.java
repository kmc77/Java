package ex07_test_02_static;

public class Student4_static_main_method_arrray_sort {

	public static void main(String[] args) {
		Student4[] students = { new Student4("강호동", 85, 60, 70),
								new Student4("이승기", 90, 95, 80),
								new Student4("유재석", 75, 80, 100),
								new Student4("하하", 80, 70, 95),
								new Student4("이광수", 100, 65, 80) };

		students[0].sort(students);
		printStudent4(students);

	}

	

	static void printStudent4(Student4[] objs) {
		System.out.println("=========== 학생별 / 과목별 총점구하기 ===========");
		System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균");
		

		for (Student4 obj : objs) {
			System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
	}
		System.out.print("\n총점\t");
		System.out.println(Student4.korTotal+"\t"
						  +Student4.engTotal+"\t"
						  +Student4.mathTotal);
	}
	
	

}
