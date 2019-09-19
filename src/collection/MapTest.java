package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

//Map
public class MapTest {
	public static void main(String[] args) {
		
		//hashMap����ϣ�㷨����ѯЧ�ʸߣ�����һ��keyΪnull,���valueΪnull
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "hehe");
		hashMap.put("2", "haha");
		
		//linkedHashMap,��ϣ�㷨������������ɾ�죬��ѯ��
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		//������㷨����Χ��ѯ
		Map<String, String> treeMap = new TreeMap<>();
		
		//����key��ȡvalue
		System.out.println(hashMap.get("1"));
		
		//��ȡ����key���浽set
		Set<String> keys = hashMap.keySet();
		for (String str : keys) {
			System.out.println(str);
		}
		
		//��ȡ����value���浽collection
		Collection<String> values = hashMap.values();
		Iterator<String> iterator = values.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//��ȡ����entrys���
		Set<Entry<String, String>> entrys = hashMap.entrySet();
		Iterator<Entry<String, String>> entryIterator = entrys.iterator();
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
		
	}
	
	
}
