package ex06_1_array;

import java.util.Scanner;

public class ArrayExample5_String2 {

	public static void main(String[] args) {
		
		String[] names = 
				new String[] {"홍길동", "전우치", "홍길동", "세종대왕", "김길동"};
		
		
		Scanner sc = new Scanner(System.in);
		
		//몇 번 방에 들어있는지 확인하는 변수로 초기값 -1은 인덱스와 겹치지 않는 수를 사용합니다.
		int index = -1;
		
		System.out.println("검색할 이름을 입력하세요?");
		System.out.print("이름:");
		String inputname = sc.next();
		
		for (int i = 0; i < names.length; i++ ) { //0 1 2 3 4 정순
			if (inputname.equals(names[i])) {
				index = i; //같은 이름이 두개인 경우에는 index는 뒤에 나온 i 값을 가지고 있습니다.
				break;
			}  
		}
		
		// 입력한 이름과 배열에 저장된 이름을 찾았을 때	
		if (index != -1) {
			System.out.println(inputname + "는(은) 배열의 인덱스 " + index + "에서 찾았습니다.");
		} else // 찾지 못했을 때
			System.out.println(inputname + "는(은) 배열방에서 찾지 못했습니다.");
		
		sc.close();
		
	}

}
