package test;

//�̳�Threadʵ�ֶ��߳�
public class TicketDemo2 extends Thread {

	// ע��Ҫʵ�ֶ���̹߳���һ�����ݣ�ticket���ܹ���run()�еľֲ�����
	private int ticket = 5;

	// run()����Ϊ�߳�Ҫִ�е�����
	// ������run()�����ϼ�synchronized������
	@Override
	public void run() {
		// ����
		//synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "--" + ticket--);
				}
			}
		//}
	}
	// ����̹߳���һ������
	public static void main(String[] args) {
		TicketDemo2 td = new TicketDemo2();
		Thread t1 = new Thread(td, "t1");
		Thread t2 = new Thread(td, "t2");
		Thread t3 = new Thread(td, "t3");
		Thread t4 = new Thread(td, "t4");
		Thread t5 = new Thread(td, "t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	// ����t1��t2��û�й���һ������
	// public static void main(String[] args) {
	// TestDemo2 t1 = new TestDemo2("t1");
	// TestDemo2 t2 = new TestDemo2("t2");
	// t1.start();
	// t2.start();
	// }

}
