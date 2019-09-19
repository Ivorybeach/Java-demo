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
		
		//hashMap，哈希算法，查询效率高，允许一个key为null,多个value为null
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "hehe");
		hashMap.put("2", "haha");
		
		//linkedHashMap,哈希算法和链表，链表增删快，查询慢
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		//红黑树算法，范围查询
		Map<String, String> treeMap = new TreeMap<>();
		
		//根据key获取value
		System.out.println(hashMap.get("1"));
		
		//获取所有key保存到set
		Set<String> keys = hashMap.keySet();
		for (String str : keys) {
			System.out.println(str);
		}
		
		//获取所有value保存到collection
		Collection<String> values = hashMap.values();
		Iterator<String> iterator = values.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//获取所有entrys输出
		Set<Entry<String, String>> entrys = hashMap.entrySet();
		Iterator<Entry<String, String>> entryIterator = entrys.iterator();
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
		
	}
	
	
}
