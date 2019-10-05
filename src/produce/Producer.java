package produce;

//������
public class Producer implements Runnable {

	private Product product;

	public Producer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		// ����5��
		for (int i = 0; i < 5; i++) {
			product.produce();
		}
	}
}
