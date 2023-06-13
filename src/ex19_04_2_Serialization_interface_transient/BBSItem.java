package ex19_04_2_Serialization_interface_transient;
//직렬화 가능 클래스를 만드는 예

// - implements java.io.Serializable 없는 클래스 - 직렬화 안됨
// 실행 순서 : ObjectOutputExample2.java -> ObjectInputExample2.java

class BBSItem implements java.io.Serializable { // 게시물 클래스
	 
	private static int itemNum = 0; // 게시물의 수 - 정적 필드는 직렬화 대상이 되지 않습니다.
	private String writer; // 글쓴이 - 인스턴스 필드는 직렬화 대상이 됩니다.
	private transient String passwd; // 패스워드 - 인스턴스 필드는 직렬화 대상이 됩니다.
									//직렬화 대상이 되지 않습니다.
	
	private String title; // 제목 - 인스턴스 필드는 직렬화 대상이 됩니다.
	private String content;// 내용 - 인스턴스 필드는 직렬화 대상이 됩니다.

	// 생성자는 직렬화 대상이 되지 않습니다.
	BBSItem(String writer, String passwd, String title, String content) {
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}

	// 메서드는 직렬화 대상이 되지 않습니다.
	void modifyContent(String content, String passwd) {
		if (!passwd.equals(this.passwd))
			return;
		this.content = content;
	}
	
	//메서드는 직렬화 대상이 되지 않습니다.
	public String toString() {
		return "전체게시물의 수: " + itemNum + 
				"\n글쓴이: " + writer +
				"\n패스워드: " + passwd +
				"\n제목: " + title +
				"\n내용: " + content;
		
	}

}
