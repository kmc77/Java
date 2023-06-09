package ex15_5_HashSet;

import java.util.HashSet;

public class HashSet2_Generics_Lotto {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);

		}

		System.out.println(set);
	}

}
