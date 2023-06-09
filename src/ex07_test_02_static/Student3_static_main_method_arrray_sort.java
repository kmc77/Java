package ex07_test_02_static;

public class Student3_static_main_method_arrray_sort {

	public static void main(String[] args) {
		Student3[] students = { new Student3("강호동", 85, 60, 70),
								new Student3("이승기", 90, 95, 80),
								new Student3("유재석", 75, 80, 100),
								new Student3("하하", 80, 70, 95),
								new Student3("이광수", 100, 65, 80) };

		
		printStudent3(students);

	}

	

	static void printStudent3(Student3[] objs) {
		System.out.println("=========== 학생별 / 과목별 총점구하기 ===========");
		System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균");
		
		objs[0].sort(objs); // sort 불러서 정렬

		for (Student3 obj : objs) {
			System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
	}
		System.out.print("\n총점\t");
		System.out.println(Student3.korTotal+"\t"
						  +Student3.engTotal+"\t"
						  +Student3.mathTotal);
	}
	
	

}
