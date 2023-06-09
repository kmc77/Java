package ex07_02_constructor;


public class ConstrExample1 {
public static void main(String[] args) {

	
	GoodsStock g = new GoodsStock("52135", 200);
	System.out.println("상품코드:" + g.goodCode);
	System.out.println("재고수량:" + g.stockNum);

	g.addStock(1000);
	System.out.println("=====g.addStock(1000) 후=====");
	System.out.println("상품코드:" + g.goodCode);
	System.out.println("재고수량:" + g.stockNum);

	g.subtractStock(500);
	System.out.println("=====g.subtractStock(500) 후=====");
	System.out.println("상품코드:" + g.goodCode);
	System.out.println("재고수량:" + g.stockNum);

}
}