package ex05_2_switch;

public class SwitchExample3_1_String {

	public static void main(String[] args) {
		String ch = "g";

		switch (ch) {
		case "A":
		case "a":
			System.out.println("사과");
			break;

		case "P":
		case "p":
			System.out.println("배");
			break;

		case "G":
		case "g":
			System.out.println("포도");
			break;

		default:
			System.out.println("?");
		}
		System.out.println("끝.");

	}

}
