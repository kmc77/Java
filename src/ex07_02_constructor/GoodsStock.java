package ex07_02_constructor;



	class GoodsStock {

		String goodCode;
		int stockNum;
		
		GoodsStock(String goodCode, int stockNum) {
			this.goodCode = goodCode;
			this.stockNum = stockNum;
		}
		
		void addStock (int amount) {
			stockNum += amount;
		}
		
		int subtractStock (int amount) {
			if (stockNum < amount)
				return 0;
			stockNum -= amount;
			return amount;
		}
	

	}
	
	
