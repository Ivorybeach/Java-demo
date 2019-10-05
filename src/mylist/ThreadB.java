package mylist;

public class ThreadB implements Runnable {

	private Object lock;

	// 线程A
	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {

		synchronized (lock) {
			System.out.println(this);
			for (int i = 0; i < 10; i++) {
				if (MyList.size() == 5) {
					lock.notify();
					System.out.println("已发出通知");
				}
				MyList.add();
				System.out.println("添加了" + (i + 1) + "个元素");
			}
		}
	}
}
