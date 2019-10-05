package threadlocal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreadLocalTest implements Runnable {
	
	private Data data;
	
	private ArrayList<String> list;

	public ThreadLocalTest(Data data) {
		this.data = data;
	}
	public ThreadLocalTest(ArrayList<String> list) {
		this.list=list;
	}

	@Override
	public void run() {
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>(4);
		list1.add("����");
		list1.add("�Ǻ�");
		list1.add("�ٺ�");
		ArrayList<String> list2 = new ArrayList<String>(3);
		list2.add("л����");
		list2.add("�Ű�֥");
		list2.add("�¹�ϣ");

		Data data = new Data();
		ThreadLocalTest tlt = new ThreadLocalTest(data);
		ThreadLocalTest tlt2 = new ThreadLocalTest(list1);
		
		
		new Thread(tlt).start();

	}
}

class Data {

	private ThreadLocal<ArrayList<String>> threadLocal = new ThreadLocal<ArrayList<String>>() {
		protected ArrayList<String> initialValue() {
			return new ArrayList<>();
		}
	};

	public void set(ArrayList<String> value) {
		threadLocal.set(value);
	}

	public ArrayList<String> get() {
		return threadLocal.get();
	}
}
