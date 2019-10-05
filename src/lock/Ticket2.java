package lock;

import java.util.concurrent.locks.ReentrantLock;

//���Կ���������֮��t1������֮��Ż�t2������˵��lock��Ч
public class Ticket2 implements Runnable{

	//��������
	ReentrantLock lock = new ReentrantLock();
	
	public int ticket = 10;
	
	@Override
	public void run() {
		lock.lock();
		
		try {
			for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()+"��Ʊ��"+ticket--);
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
