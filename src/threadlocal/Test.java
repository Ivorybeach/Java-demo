package threadlocal;

/**
 * Created by noteless on 2019/1/30. Description:
 */
public class Test {
	// ����ThreadLocal����
	static ThreadLocal<String> threadLocal = new ThreadLocal<>();

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			// thread1������ֵ
			threadLocal.set("this is thread1's local");
			// ��ȡֵ
			System.out.println(Thread.currentThread().getName() + ": threadLocal value��" + threadLocal.get());
			// �Ƴ�ֵ
			//threadLocal.remove();
			// �ٴλ�ȡ
			System.out.println(
					Thread.currentThread().getName() + ": after remove threadLocal value��" + threadLocal.get());
		}, "thread1");
		Thread thread2 = new Thread(() -> {
			// thread2������ֵ
			threadLocal.set("this is thread2's local");
			// ��ȡֵ
			System.out.println(Thread.currentThread().getName() + ": threadLocal value��" + threadLocal.get());
			// �Ƴ�ֵ
			//threadLocal.remove();
			// �ٴλ�ȡ
			System.out.println(
					Thread.currentThread().getName() + ": after remove threadLocal value��" + threadLocal.get());
		}, "thread2");
		thread1.start();
		thread2.start();
	}
}