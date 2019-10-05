package produce;

public class Product {
	private String name;
	private String note;
	//标志位
	boolean flag = true;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	//生产产品
	public synchronized void produce() {
		//flag为true，可以生产
		if (!flag) {
			try {
				//不再生产，等待消费者取走
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//加点时间，效果更明显
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("生产一件产品");
		//更改标志位
		flag=false;
		//唤醒消费者线程
		this.notify();
	}
	
	//消费产品
	public synchronized void cosume() {
		//如果为true,需要生产，不可取走
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("取走一件产品");
		//更改标志位
		flag=true;
		//唤醒生产者线程
		this.notify();
	}
}
