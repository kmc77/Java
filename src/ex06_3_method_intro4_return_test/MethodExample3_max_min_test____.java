	/*
	 * ========== 학생별   /  과목별 총점구하기  ==========
		국어	수학	영어	총점	평균
강호동	85	60	70	215	71.7
이승기	90	95	80	265	88.3
유재석	75	80	100	255	85.0
하하		80	70	95	245	81.7
이광수	100	65	80	245	81.7
=============================================
총점		430	370	425	

아래의 소스를 참고로 위와 같이 출력되도록 합니다.
        String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };
		int[][] score = { 
				{ 85, 60, 70 }, // 0행("강호동")
				{ 90, 95, 80 }, // 1행("이승기")
				{ 75, 80, 100 }, // 2행("유재석")
				{ 80, 70, 95 }, // 3행("하하")
				{ 100, 65, 80 } // 4행("이광수")
		};
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		
		int r, c;
	 * 
	 */


package ex06_3_method_intro4_return_test;

public class MethodExample3_max_min_test____ {

	public static void main(String[] args) {
		
		
			  int[][] score = new int[][] {
	              {100,100,100},
	              {20,20,20},
	              {30,30,30},
	              {40,40,40},
	              {50,50,50}
	          };

	          
	//과목별 총점
				int korTotal = 0;
				int engTotal = 0;
				int mathTotal = 0;

				int totalSum = 0;
				double avg = 0.0;

				System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
				System.out.println("--------------------------------------------");
				
				for (int i = 0; i < score.length; i++) {
					int sum = 0; // 개인 총점 
					double average = 0.0;
					
					korTotal += score[i][0]; //국어 점수 누적
					engTotal += score[i][1]; //영어 점수 누적
					mathTotal += score[i][2]; //수학 점수 누적
					
					//번호를 3개 자리를 차지하며 출력시키는 부분
					System.out.printf("%3d", (i*1));
					
					for (int j = 0; j < score[i].length; j++) {
						sum += score[i][j];
						System.out.printf("\t%d", score[i][j]); //tap 만큼 띄우기
						
					}
					
					totalSum += sum; //총합
					average = (double)sum/score[i].length;// 개인별 평균
					avg += average; //전체 평균
					System.out.printf("\t%d \t%.2f\n", sum, average);
					
					
				}
				
				avg /= (double)score.length;
				System.out.println("--------------------------------------------");
				System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, totalSum, avg);
				
			
			
			
	
		System.out.println("\n==============================================");	


}
}
