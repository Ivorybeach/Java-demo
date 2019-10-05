package threadlocal;

/**
 * Created by noteless on 2019/1/30. Description:
 */
public class Test {
	// 定义ThreadLocal变量
	static ThreadLocal<String> threadLocal = new ThreadLocal<>();

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			// thread1中设置值
			threadLocal.set("this is thread1's local");
			// 获取值
			System.out.println(Thread.currentThread().getName() + ": threadLocal value：" + threadLocal.get());
			// 移除值
			//threadLocal.remove();
			// 再次获取
			System.out.println(
					Thread.currentThread().getName() + ": after remove threadLocal value：" + threadLocal.get());
		}, "thread1");
		Thread thread2 = new Thread(() -> {
			// thread2中设置值
			threadLocal.set("this is thread2's local");
			// 获取值
			System.out.println(Thread.currentThread().getName() + ": threadLocal value：" + threadLocal.get());
			// 移除值
			//threadLocal.remove();
			// 再次获取
			System.out.println(
					Thread.currentThread().getName() + ": after remove threadLocal value：" + threadLocal.get());
		}, "thread2");
		thread1.start();
		thread2.start();
	}
}