package produce_lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
	public static void main(String[] args) {
		
		Product product = new Product();
		
		Producer p = new Producer(product);
		Consumer c = new Consumer(product);
		
		new Thread(p, "生产者-").start();
		new Thread(c, "消费者-").start();
		
	}
}
