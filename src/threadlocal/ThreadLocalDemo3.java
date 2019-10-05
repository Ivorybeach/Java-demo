package threadlocal;

public class ThreadLocalDemo3 extends Thread{
	 //private static int temp=3;
static ThreadLocal<Integer> t = new ThreadLocal<>();

	    @Override
	    public void run() {
	    	t.set(3);
	    	int temp = t.get();
	        for (int i = 0; i < 3; i++) {
	        	
	        	System.out.println(Thread.currentThread().getName()+" " + temp--);
	            
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        ThreadLocalDemo3 threadLocaDemo1 = new ThreadLocalDemo3();
	        ThreadLocalDemo3 threadLocaDemo2 = new ThreadLocalDemo3();
	        ThreadLocalDemo3 threadLocaDemo3 = new ThreadLocalDemo3();
	        threadLocaDemo1.start();
	        threadLocaDemo2.start();
	        threadLocaDemo3.start();
	        Thread.sleep(300);
	    }

	}

