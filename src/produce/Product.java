package produce;

public class Product {
	private String name;
	private String note;
	//��־λ
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
	
	//������Ʒ
	public synchronized void produce() {
		//flagΪtrue����������
		if (!flag) {
			try {
				//�����������ȴ�������ȡ��
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�ӵ�ʱ�䣬Ч��������
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����һ����Ʒ");
		//���ı�־λ
		flag=false;
		//�����������߳�
		this.notify();
	}
	
	//���Ѳ�Ʒ
	public synchronized void cosume() {
		//���Ϊtrue,��Ҫ����������ȡ��
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
		System.out.println("ȡ��һ����Ʒ");
		//���ı�־λ
		flag=true;
		//�����������߳�
		this.notify();
	}
}
