package ex07_03_two_constructor;

class SubscriberInfo {

	String name, id, password;
	String phoneNo, address;

	//3개의 String 타입 파라미터를 갖는 생성자 선언
	SubscriberInfo (String name, String id, String password){
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	//5개의 String 타입 파라미터를 갖는 생성자 선언
	SubscriberInfo (String name, String id, String password, String phoneNo, String address){
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	//메서드
	void changePassword(String s) {
		password = s;
	}
	
	//메서드
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	//메서드
	void setAddress(String address) {
		this.address = address;
	}

}



