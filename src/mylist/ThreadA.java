package mylist;

public class ThreadA implements Runnable {

	private Object lock;

	// Ïß³ÌA
	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		
		synchronized (lock) {
			System.out.println(this);
			if (MyList.size() != 5) {
				try {
					System.out.println("wait begin " + System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end " + System.currentTimeMillis());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
