package ex07_01_obfect;

public class make_Test2 {
	public static void main(String[] arge) {

		
		GoodsStock g = new GoodsStock();
		
		g.goodsCode	= "52135";	
		g.stockNum	= 200;	
		System.out.println("상품코드:" + g.goodsCode);
		System.out.println("재고수량:" + g.stockNum);
		
		g.addStock(1000);
		System.out.println("=====g.addStock(1000) 후=====");
		System.out.println("상품코드:" + g.goodsCode);
		System.out.println("재고수량:" + g.stockNum);
		
		g.subtractStock(500);
		System.out.println("=====g.subtractStock(500) 후=====");
		System.out.println("상품코드:" + g.goodsCode);
		System.out.println("재고수량:" + g.stockNum);

	
		 } 
			 
	 }

	