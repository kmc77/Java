package ex15_6_TreeSet1;

import java.util.TreeSet;

public class HashSet2_Generics_Lotto {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();

		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);

		}

		System.out.println(set);
	}

}
