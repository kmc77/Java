package ex07_02_constructor;


public class ConstrExample2_method {
	public static void main(String[] args) {

		GoodsStock g = new GoodsStock("52135", 200); // 선언된 생성자를 이용해서 객체를 생성
		print(g);

		g.addStock(1000); // 메서드 호출
		System.out.println("=====g.addStock(1000) 후=====");
		print(g);

		g.subtractStock(500);
		System.out.println("=====g.subtractStock(500) 후=====");
		print(g);

	}

	public static void print(GoodsStock g) {
		System.out.println("상품코드:" + g.goodCode);
		System.out.println("재고수량:" + g.stockNum);

	}
}