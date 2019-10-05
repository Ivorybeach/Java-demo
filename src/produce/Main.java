package produce;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Product product = new Product();
		
		Thread t1 = new Thread(new Producer(product), "������");
		Thread t2 = new Thread(new Consumer(product), "������");
		
		t1.start();
		t2.start();
	}
}
