package ex06_2_sort;

public class SelectionSort_asc2_source {

	public static void main(String[] args) {

		// 선택정렬 알고리즘
		// 무작위 데이터를 오름차순/내림차순 정렬

		int[] arr = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length - 1; i++) { //시작 지점과 끝지점 파악, -1 하는 이유는 의미없는 한바퀴 생략하기 위해서임 
			for (int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if (arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int imsi = arr[i]; // 값 변경해야 하깅 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = imsi; // i를 j로 변경
				}
			}

		}

		System.out.println("정렬 후 데이터 : ");
		for (int data : arr) {
			System.out.println(data + "\t");
		}

	}

}
