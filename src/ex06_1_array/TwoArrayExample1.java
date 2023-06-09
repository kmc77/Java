package ex06_1_array;

public class TwoArrayExample1 {

	public static void main(String[] args) {

		int table[][] = new int[3][4];

		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];

		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
		// System.out.println("table[3][4] = " + table[3][4]);

		System.out.println("table[0][0] = " + table[0][0]);
		System.out.println("table[0][1] = " + table[0][1]);
		System.out.println("table[0][2] = " + table[0][2]);
		System.out.println("table[0][3] = " + table[0][3]);

		System.out.println("table[1][0] = " + table[1][0]);
		System.out.println("table[1][1] = " + table[1][2]);
		System.out.println("table[1][2] = " + table[1][3]);
		System.out.println("table[1][3] = " + table[1][3]);

		System.out.println("table[2][0] = " + table[2][0]);
		System.out.println("table[2][1] = " + table[2][1]);
		System.out.println("table[2][2] = " + table[2][2]);
		System.out.println("table[2][3] = " + table[2][3]);

		System.out.println("===================================");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("table[0][" + i + "] = " + table[0][i]);
			
		for (int i = 0; i < 4; i++) {
			System.out.println("table[0][" + i + "] = " + table[1][i]);
			
		for (int i = 0; i < 4; i++) {
			System.out.println("table[0][" + i + "] = " + table[1][i]);		
			
		
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 4; i++)
				System.out.println("table[" + j + "][" + i + "] = " + table[i][j]);
		}
		
		
		System.out.println("===================================");

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println("table[" + j + "][" + i + "] = " + table[i][j]);

			}
		}

	}

