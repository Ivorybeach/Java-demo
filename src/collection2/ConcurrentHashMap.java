package collection2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//hashTable的优化ConcurrentHashMap
public class ConcurrentHashMap {
	public static void main(String[] args) {
		
		//创建concurrentHashMap
		Map<String, String> chm = new java.util.concurrent.ConcurrentHashMap<>();
		//添加元素
		chm.put("hehe", "111");
		chm.put("haha", "222");
		//获取所有entries
		Set<Entry<String, String>> chmEntry = chm.entrySet();
		//获取迭代器
		Iterator<Entry<String, String>> chmIterator = chmEntry.iterator();
		//迭代输出
		while (chmIterator.hasNext()) {
			//注意此处强转
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) chmIterator
					.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
	}
}
