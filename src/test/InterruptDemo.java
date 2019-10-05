package test;

public class InterruptDemo extends Thread {

	@Override
	public void run() {
			while (true) {
				//判断终止标志
				if (this.isInterrupted()) {
					System.out.println("ֹͣ停止了!");
					//停止run()方法，线程终止
					return;
				}
				System.out.println("timer=" + System.currentTimeMillis());
			}
	}

	
	public static void main(String[] args) {
		InterruptDemo t=new InterruptDemo();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//设置终止标志
		t.interrupt();
	}
}
