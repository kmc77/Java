package ex07_00_object;

 class Saram6 {

	 	//필드(멤버변수)
		String name;
		double w;
		double ki;
		int age;
		
		//생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 한다.
		Saram6(String name, double w, double ki, int age){
			this.name = name;
			this.w = w;
			this.ki = ki;
			this.age = age;
		}
		// 생성자 - 반드시 클래스 이름과 똑같고 리터 타입이 없어야 합니다.
		Saram6(String name2, double ki){
			this.name = name2;
			this.ki = ki;
		}
		// 생성자 - 반드시 클래스 이름과 똑같고 리터 타입이 없어야 합니다.
		Saram6(double w, String name){
			this.name = name;
			this.w = w;
		
		}
		
		//메서드
		public void eat() {
			System.out.println(this.name + " 밥을 먹는다.");
			
		}
		
		//메서드
		public void walk() {
			System.out.println(this.name + "(이)가 걷기전 몸무게는 " + w + "입니다.");
		}
		
		//메서드
		public void sesu() {
			System.out.println(this.name + "이(가) 세수한다.");
		}

	}


