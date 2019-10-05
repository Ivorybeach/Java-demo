package produce;

//生产者
public class Producer implements Runnable {

	private Product product;

	public Producer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		// 生产5份
		for (int i = 0; i < 5; i++) {
			product.produce();
		}
	}
}
