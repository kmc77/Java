package ex06_1_array;

public class TwoArrayExample01_5_method3_sort {

	public static void main(String[] args) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수"};
		String sub_name[] = {"국어", "수학", "영어"};
		int[][] score = {
				{ 85, 60, 70 }, //0행("강호동")
				{ 90, 95, 80 }, //1행("이승기")
				{ 75, 80, 100}, //2행("유재석")
				{ 80, 70, 95 }, //3행("하하")
				{ 100, 65, 80 } //4행("이광수")
		};
			
		
		int[] subject = getSubjectTotal(score); 
		int[] student = getstubentTotal(score); 
		
		print( name, sub_name, score, subject, student);
	
	} //main() end
	
		
	
	private static void print(String[] name, String[] sub_name, int[][] score, int[] subject, int[] student) {

		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print("=");
		}
		System.out.print(" 학생별 / 과목별 총점구하기 ");
		for (int i = 0; i < 10; i++)
			System.out.print("=");

		System.out.print("\n\t");
		for (int c = 0; c < 3; c++)
			System.out.print(sub_name[c] + "\t");

		System.out.print("총점\t평균");

		for (int r = 0; r < score.length; r++) {
			System.out.print("\n" + name[r] + "\t");

			for (int c = 0; c < score[r].length; c++) {
				System.out.print(score[r][c] + "\t");
			}
			System.out.printf("%d\t%.1f", student[r], student[r] / 3.0);
		}

		System.out.println();
		for (int i = 0; i < 45; i++)
			System.out.print("=");

		System.out.print("\n" + "총점" + "\t");
		for (int c = 0; c < subject.length; c++)
			System.out.print(subject[c] + "\t");
	}

	private static int[] getSubjectTotal(int[][] score) {
		int[] subject = new int[3]; // 과목 총점 저장
		for (int r = 0; r < score.length; r++) {
			for (int c = 0; c < score[r].length; c++) {
				subject[c] += score[r][c];
			}
		}
		return subject;
	}

	private static int[] getstubentTotal(int[][] score) { // 학생 총점
		int[] student = new int[5];
		for (int r = 0; r < score.length; r++) {
			for (int c = 0; c < score[r].length; c++) {
				student[r] += score[r][c];
			}
		}
		return student;
	}
}
	
