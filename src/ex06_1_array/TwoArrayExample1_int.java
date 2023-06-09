package ex06_1_array;

public class TwoArrayExample1_int {

	public static void main(String[] args) {
		int table[][] = {
				 {1, 2, 3, 4},
				 {5, 6, 7},
				 {8, 9, 10, 11, 12}
               };


			for (int i = 0; i < table.length; i++) {
					for (int j = 0; j < table[i].length; j++) 
						System.out.println("table[" + i + "][" + j + "]=" + table[i][j]);
}
			System.out.println();	
			System.out.println("===========================");
			
			
			for (int[] data : table ) { //행//table 이 가르키고 있는 각 요소들은 일차원 배열이다.
				for(int data1 : data) { //열
					System.out.print(data1 + " ");
				}
				System.out.println();	
	}
			System.out.println("End.");
			

  }
}
