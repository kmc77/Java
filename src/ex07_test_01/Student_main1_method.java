package ex07_test_01;

//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
 class Student_main1_method  {
	public static void main(String[] args) {
		
		Student2 h1 = new Student2("강호동", 85, 60, 70);
		Student2 h2 = new Student2("이승기", 90, 95, 80);
		Student2 h3 = new Student2("유재석", 75, 80, 100);
		Student2 h4 = new Student2("하하", 80, 70, 95);
		Student2 h5 = new Student2("이광수", 100, 68, 80);
		
		int subject[] = getTotal(h1, h2, h3, h4, h5);
		print(h1, h2, h3, h4, h5, subject);
		
	}
	
		private static int[] getTotal(Student2 h1, Student2 h2, Student2 h3, Student2 h4, Student2 h5) {
			int[] subject = new int[3];
			
			subject[0] = h1.kor + h2.kor + h3.kor + h4.kor + h5.kor;
			subject[1] = h1.eng + h2.eng + h3.eng + h4.eng + h5.eng;
			subject[2] = h1.math + h2.math + h3.math + h4.math + h5.math;
			return subject;
		}
		
	static void print(Student2 h1, Student2 h2, Student2 h3, Student2 h4, Student2 h5, int[] total) {
		System.out.println("=========== 학생별 / 과목별 총점구하기 ===========");
		System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균");
		printInfo(h1);
		printInfo(h2);
		printInfo(h3);
		printInfo(h4);
		printInfo(h5);
		
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		for (int i = 0; i < total.length; i++)
			System.out.print(total[i]+"\t");
		
	}	
	static void printInfo(Student2 student) {
		System.out.print(student.name+"\t"+student.kor+"\t"+student.eng+"\t"+student.math+"\t"+student.getTotal()+"\t");
		 System.out.printf("%.1f\n", student.getAverage());

	}
 }

 


