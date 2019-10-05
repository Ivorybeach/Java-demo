package produce_lock;

public class Consumer implements Runnable {

	private Product product;

	public Consumer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			product.consume();
		}
	}
}
