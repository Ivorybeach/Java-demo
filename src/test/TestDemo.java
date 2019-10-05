package test;

//继承Runnable接口实现多线程

public class TestDemo implements Runnable{
	
	private int ticket = 5;
	
	@Override
	public void run() {
		synchronized (this) {
			
		}
		for (int i = 0; i < 10; i++) {
			if (ticket>0) {
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"--"+ticket--);
			}
		}
	}

	public static void main(String[] args) {
		TestDemo td = new TestDemo();
		TestDemo td2 = new TestDemo();
		new Thread(td).start();
		new Thread(td).start();
	}
	
	
}
