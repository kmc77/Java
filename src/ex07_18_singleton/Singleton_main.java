package ex07_18_singleton;

public class Singleton_main {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); //에러
		//Singleton obj1 = new Singleton(); //에러
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	}

}
