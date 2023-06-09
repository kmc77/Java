package ex17_07_SharedArea_solution;

//공유 영역 클래스
class SharedArea {

	private double result;

	SharedArea() {

	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	// 공유 데이터가 쓰여졌는지 여부를 표현하는 필드-디폴트(false)
	private boolean isReady;

	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

}
