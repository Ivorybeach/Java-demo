package threadlocal;

public class Test2 {

	static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
	
	public static void main(String[] args) {
		
		threadLocal.set(5);
		System.out.println(threadLocal.get());
		
		Thread t3 = new Thread(new Runnable() {
			
			
			@Override
			public void run() {
				System.out.println(threadLocal.get());
			}
		});
		
		t3.start();
		Thread t1 = new Thread(() -> {
			int temp = threadLocal.get();
			System.out.println(temp--);
		}); 
		
		Thread t2 = new Thread(() -> {
			System.out.println(threadLocal.get());
		});
//		t1.start();
//		t2.start();
		
		
		
		
	}
	
	
}
