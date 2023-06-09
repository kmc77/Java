package ex07_test_01;

//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
 class Student_main1_method_array_sort  {
	public static void main(String[] args) {
		/*
		Student2 h1 = new Student2("강호동", 85, 60, 70);
		Student2 h2 = new Student2("이승기", 90, 95, 80);
		Student2 h3 = new Student2("유재석", 75, 80, 100);
		Student2 h4 = new Student2("하하", 80, 70, 95);
		Student2 h5 = new Student2("이광수", 100, 68, 80);
		Student2[] Students = {h1, h2, h3, h4, h5};
		*/
		//int[] a = {1,2,3};
		
		Student3[] students = { new Student3("강호동", 85, 60, 70),
							    new Student3("이승기", 90, 95, 80),
							    new Student3("유재석", 75, 80, 100),
							    new Student3("하하", 80, 70, 95),
							    new Student3("이광수", 100, 65, 80) };
	
		
		int subject[] = getTotal(students);
		sort(students);
		print(students, subject);
	
	}

		

		private static int[] getTotal(Student3[] objs) {
			int[] subject = new int[3];
			for (Student3 obj : objs) {
				subject[0] += obj.kor;
				subject[1] += obj.eng;
				subject[2] += obj.math;
			}
			
		return subject;
	
		}

		// 학생별 종점을 기준으로 정렬하기
		static void sort(Student3[] students) {
			for (int i = 0; i < students.length - 1; i++) {
				for (int j = i + 1; j < students.length; j++) {
					if (students[i].getTotal() < students[j].getTotal()) { //오름, 내림 차순
						Student3 imsi = students[i];
						students[i] = students[j];
						students[j] = imsi;

				}
			}
		}
	}

	static void print(Student3[] objs, int[] subject) {

		System.out.println("=========== 학생별 / 과목별 총점구하기 ===========");
		System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균");

		for (Student3 obj : objs) {
			printInfo(obj);
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		for (int i = 0; i < subject.length; i++)
			System.out.print(subject[i] + "\t");
	}
	
	private static void printInfo(Student3 student) {

		System.out.print(student.name + "\t" + student.kor + "\t" + student.eng + "\t" + student.math + "\t"
				+ student.getTotal() + "\t");
		System.out.printf("%.1f\n", student.getAverage());

	}
}
 
 