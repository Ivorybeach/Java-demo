package collection2;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//Vector、ArrayList的线程安全集合
public class VectorTest {

	public static void main(String[] args) {
		
		List<String> vector = new Vector<>();
		
		vector.add("哈哈");
		vector.add("呵呵");
		vector.add("嘻嘻");
		
		//for循环遍历
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		//for-each
		for (String string : vector) {
			System.out.println(string);
		}
		//iterator
		for (Iterator iterator = vector.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		
	}
	
}
