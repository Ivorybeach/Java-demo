package lock;

import java.util.concurrent.locks.ReentrantLock;

//可以看到，加锁之后，t1操作完之后才换t2操作，说明lock生效
public class Ticket2 implements Runnable{

	//可重入锁
	ReentrantLock lock = new ReentrantLock();
	
	public int ticket = 10;
	
	@Override
	public void run() {
		lock.lock();
		
		try {
			for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()+"卖票："+ticket--);
			}
		}finally {
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		Ticket2 ticket = new Ticket2();
		Thread t1 = new Thread(ticket,"t1");
		Thread t2 = new Thread(ticket,"t2");
		t1.start();
		t2.start();
	}

}
