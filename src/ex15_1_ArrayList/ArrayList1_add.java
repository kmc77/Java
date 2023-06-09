package ex15_1_ArrayList;

import java.util.*;

/*
 List 인터페이스 - ArrayList (상속받는 클래스)
 1. 여러가지 자료형의 Data를 모두 저장할 수 있습니다.
 	ex)int, double, char, boolean, String etc
 2. 입력한 순서대로 출력됩니다.(index 번호 순으로 저장됨)
 3. 중복된 Data를 저장 할 수 있습니다.
 4. 동적인 저장 구조를 이용할 수 있습니다.(add(), remove())	
 */
public class ArrayList1_add {

	public static void main(String[] args) {
		// 업개스팅(상속해준 메서드만 사용가능합니다.)
		// List list = new ArrayList();
		ArrayList list = new ArrayList();

		// 자료 추가
		list.add("하나");
		list.add(2); // list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add("A");

		System.out.println(list); // list의 모든 데이터 출력
		System.out.println(list.toString());

		// size() : 데이터의 갯수 구하는 메서드
		System.out.println("데이터의 갯수 = " + list.size());

		// get(index) : 해당 인덱스의 데이터 가져오는 메서드
		// get(3) : 0부터 시작, index = 3 인 데이터 출력해라
		System.out.println("list.get(3) = " + list.get(3));
	}

}
