package collection2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//hashTable、hashMap的线程安全类
public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("呵呵", "1");
		hashTable.put("哈哈", "2");
		hashTable.put("嘿嘿", "3");
		
		//遍历HashTable的方式，同样适用于HashMap:
		
		//1.keySet()获取所有key的set，foreach遍历
		for (String string : hashTable.keySet()) {
			System.out.println(string+"="+hashTable.get(string));
		}
		//2.iterator
		Iterator<Map.Entry<String, String>> iterator = hashTable.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) iterator
					.next();
			System.out.println(entry);
			System.out.println(entry.getKey()+entry.getValue());
		}
		//3.分开写上面的iterator
		//获取所有entries
		Set<Entry<String, String>> entrySet = hashTable.entrySet();
		//获取entrier的iterator
		Iterator<Entry<String, String>> entryIterator=entrySet.iterator();
		//开始遍历
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
		//3.for-each
		for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
	}
}
