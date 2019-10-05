package produce_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Product {

	private String name;
	private String note;
	//��־λ��flagΪtrue������������������ȡ��
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
		//falgΪtrue������������false����������
		if (!flag) {
			try {
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"����һ����Ʒ");
		//ȡ��֮����ı�־λ
		flag=false;
		try {
			Thread.sleep(100);
			//�����������߳�
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
		lock.unlock();
		}
	}
	
	public void consume() {
		lock.lock();
		//flagΪtrue,������ȡ��
		if (flag) {
			try {
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"ȡ��һ����Ʒ");
		//ȡ��֮����ı�־λ
		flag=true;
		try {
			Thread.sleep(100);
			//�����������߳�
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();
	}
}
