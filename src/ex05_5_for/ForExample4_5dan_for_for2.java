package ex05_5_for;

public class ForExample4_5dan_for_for2 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {

			System.out.println("[" + dan + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);

			}
			System.out.println();

		}
	}
}