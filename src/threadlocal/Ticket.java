package threadlocal;

public class Ticket implements Runnable{

	int ticket = 5;
	
	ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();
	
	
	@Override
	public synchronized void run() {
		threadlocal.set(ticket);
		int temp = threadlocal.get();
		for (int i = 0; i < 5; i++) {
			
			if (temp > 0) {
				System.out.println(Thread.currentThread().getName()+temp--);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Ticket ticket = new Ticket();

		Thread t1 = new Thread(ticket,"Thread1£º");
		Thread t2 = new Thread(ticket,"Thread2£º");
		Thread t3 = new Thread(ticket,"Thread3£º");
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
}
