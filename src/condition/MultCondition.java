package condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MultCondition {

	ReentrantLock lock = new ReentrantLock();
	Condition conditionA = lock.newCondition();
	Condition conditionB = lock.newCondition();
	
	public void await(Condition condition,String conditionName) {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+" "+conditionName+"：wait begin");
			condition.await();
			System.out.println(Thread.currentThread().getName()+" "+conditionName+"：wait end");
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void signal(Condition condition,String conditionName) {
		lock.lock();
		System.out.println(Thread.currentThread().getName()+" "+conditionName+"：notified");
		condition.signal();
		lock.unlock();
	}
	
	public static void main(String[] args) {
		
		MultCondition test = new MultCondition();
				
		new Thread(() -> test.await(test.conditionA,"conditionA"),"Thread-1").start();
		new Thread(() -> test.await(test.conditionB,"conditionB"),"Thread-2").start();
		new Thread(() -> test.signal(test.conditionB,"conditionB"),"Thread-3").start();
		//注释Thread-4，运行程序后手动Terminate
		//new Thread(() -> test.signal(test.conditionA,"conditionA"),"Thread-4").start();
	}
}
