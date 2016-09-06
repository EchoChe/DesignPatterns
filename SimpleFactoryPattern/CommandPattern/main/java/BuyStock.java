package main.java;

public class BuyStock implements Order {

	private Stock abcStock;
	
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	
	@Override
	public void excute() {
		abcStock.buy();
	}

}
