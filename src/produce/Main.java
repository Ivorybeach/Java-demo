package produce;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Product product = new Product();
		
		Thread t1 = new Thread(new Producer(product), "生产者");
		Thread t2 = new Thread(new Consumer(product), "消费者");
		
		t1.start();
		t2.start();
	}
}
