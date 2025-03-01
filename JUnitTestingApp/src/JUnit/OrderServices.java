package JUnit;

public class OrderServices {
	private int stock=10;
	private double discount=0.10; //10%
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	//calculate order price
	public double calPrice(double price,int quantity) {
		return price*quantity*(1-discount);
	}
	public boolean placeOrder(int quantity) {
		if(quantity>stock) {
			throw new IllegalArgumentException("insufficient stock");
		}
		stock -= quantity;
		return true;
	}
	// Simulate order processing with sleep
    public void orderProcessingTest(long sleepTime) throws InterruptedException {
        Thread.sleep(sleepTime);
    }
	
    // create orderServiceTest class
	//@Test -> testInsufficientStocks -> use assertthrows
	//@Test -> calculate Total -> price,quantity->return expected and what your logic is done
}
