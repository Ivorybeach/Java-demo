package lock;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{

	//¿ÉÖØÈëËø
	ReentrantLock lock = new ReentrantLock();
	
	public int ticket = 10;
	
	@Override
	public void run() {
		lock.lock();
		
		try {
			for (int i = 0; i < 10; i++) {
				if (ticket>0) {
					System.out.println(Thread.currentThread().getName()+"ÂôÆ±£º"+ticket--);
				}
			}
		}finally {
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		Thread t1 = new Thread(ticket,"t1");
		Thread t2 = new Thread(ticket,"t2");
		t1.start();
		t2.start();
	}

}
