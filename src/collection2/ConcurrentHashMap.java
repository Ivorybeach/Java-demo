package collection2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//hashTable���Ż�ConcurrentHashMap
public class ConcurrentHashMap {
	public static void main(String[] args) {
		
		//����concurrentHashMap
		Map<String, String> chm = new java.util.concurrent.ConcurrentHashMap<>();
		//���Ԫ��
		chm.put("hehe", "111");
		chm.put("haha", "222");
		//��ȡ����entries
		Set<Entry<String, String>> chmEntry = chm.entrySet();
		//��ȡ������
		Iterator<Entry<String, String>> chmIterator = chmEntry.iterator();
		//�������
		while (chmIterator.hasNext()) {
			//ע��˴�ǿת
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) chmIterator
					.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
	}
}
