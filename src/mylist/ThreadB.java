package mylist;

public class ThreadB implements Runnable {

	private Object lock;

	// �߳�A
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
					System.out.println("�ѷ���֪ͨ");
				}
				MyList.add();
				System.out.println("�����" + (i + 1) + "��Ԫ��");
			}
		}
	}
}
