package mylist;

public class Main {
	public static void main(String[] args) {

		Object lock = new Object();
		
		Thread ta = new Thread(new ThreadA(lock), "Thread-A");
		Thread tb = new Thread(new ThreadB(lock), "Thread-B");
		ta.start();
		tb.start();
	}
}
