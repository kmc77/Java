package ex15_1_LinkedList;

import java.util.*;

/*
 LinkedList 사용 예
 LinkedList와 ArrayList의 차이점
 	- 데이터의 추가 또는 삭제시 ArrayList보다 속도가 빠릅니다.
 	ArrayList의 경우 차례대로 데이터를 추가하고 마지막에서부터 데이터를 삭제하는 것은 LinkedList보다 빠릅니다.
 	하지만 중간에 데이터를 추가하려면 빈자리를 만들기 위해 다른 데이터를 복사해서 이동해야 하고
 	삭제인 경우에는 데이터를 재배치해야 하지만
 	LinkedList의 경우에는 각 요소간 연결만 변경해주면 되기 때문에 처리속도가 상당히 빠릅니다.
 	
 	- 검색에 ArrayList는 연속적으로 메모리상에 존재하기 때문에 찾는데 빠르지만
 		분연속적으로 위치한 LinkedList는 처음부터 차례대로 따라가야
 		원하는 값을 얻을 수 있어 검색시간이 느립니다.
 	
 */
public class ArrayList4_Generlcs_String {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		LinkedList<String> list = new LinkedList<String>();

		// list 에 3개의 데이터를 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");

		int num = list.size(); // list 에 있는 데이터의 수를 구하는 메서드

		// list 에 있는 데이터의 수만큼 반복하면서 데이터를 가져와 출력
		for (int cnt = 0; cnt < num; cnt++) {
			// get(index) 메서드를 사용하여 index위치에 있는 자료를 가져옵니다.
			String str = list.get(cnt);
			System.out.println(str);

		}

	}

}
