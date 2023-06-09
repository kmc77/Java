package ex15_1_LinkedList;

//LinkedLis에 데이터를 삽입/수정/삭제의 예
import java.util.LinkedList;

public class LinkedList2_set_remove {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		LinkedList<String> list = new LinkedList<String>();

		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		pLinkedList(list);

		list.set(0, "오렌지");
		pLinkedList(list);

		list.remove(1);
		pLinkedList(list);

		list.remove("키위");
		pLinkedList(list);

	}

	static void pLinkedList(LinkedList<String> list) {
		System.out.println("==================");
		for (int cnt = 0; cnt < list.size(); cnt++) {
			String str = list.get(cnt);

			System.out.println("index=" + cnt + " 데이터=" + str);
		}

	}
}
