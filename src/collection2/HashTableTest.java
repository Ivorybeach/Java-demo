package collection2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//hashTable��hashMap���̰߳�ȫ��
public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("�Ǻ�", "1");
		hashTable.put("����", "2");
		hashTable.put("�ٺ�", "3");
		
		//����HashTable�ķ�ʽ��ͬ��������HashMap:
		
		//1.keySet()��ȡ����key��set��foreach����
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
		//3.�ֿ�д�����iterator
		//��ȡ����entries
		Set<Entry<String, String>> entrySet = hashTable.entrySet();
		//��ȡentrier��iterator
		Iterator<Entry<String, String>> entryIterator=entrySet.iterator();
		//��ʼ����
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
		//3.for-each
		for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
	}
}
