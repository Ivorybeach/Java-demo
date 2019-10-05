package test;

//继承Thread实现多线程
public class TicketDemo2 extends Thread {

	// 注意要实现多个线程共享一份数据，ticket不能够是run()中的局部变量
	private int ticket = 5;

	// run()方法为线程要执行的内容
	// 可以在run()方法上加synchronized的区别
	@Override
	public void run() {
		// 加锁
		//synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "--" + ticket--);
				}
			}
		//}
	}
	// 多个线程共享一份数据
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

	// 这样t1和t2并没有共享一份数据
	// public static void main(String[] args) {
	// TestDemo2 t1 = new TestDemo2("t1");
	// TestDemo2 t2 = new TestDemo2("t2");
	// t1.start();
	// t2.start();
	// }

}
