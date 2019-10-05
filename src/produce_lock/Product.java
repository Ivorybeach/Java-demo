package produce_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Product {

	private String name;
	private String note;
	//标志位，flag为true，可以生产，不可以取走
	private boolean flag=true;

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public void produce() {
		lock.lock();
		//falg为true，可以生产，false不可以生产
		if (!flag) {
			try {
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"生产一件产品");
		//取走之后更改标志位
		flag=false;
		try {
			Thread.sleep(100);
			//唤醒消费者线程
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
		lock.unlock();
		}
	}
	
	public void consume() {
		lock.lock();
		//flag为true,不可以取走
		if (flag) {
			try {
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"取走一件产品");
		//取走之后更改标志位
		flag=true;
		try {
			Thread.sleep(100);
			//唤醒生产者线程
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();
	}
}
