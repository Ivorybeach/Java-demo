package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set无序，不可通过下标来访问，元素在set中的位置由其hash码决定,位置固定；至多一个null元素；不允许重复
public class SetTest {
	public static void main(String[] args) {
		
		//hashSet,当查询时根据哈希码来比较元素，查询速度快
		//底层是用hashMap实现
		Set<String> hashSet = new HashSet<>();
		hashSet.add("heihei");
		
		//linkedHashSet,底层采用链表和哈希表算法，链表查询慢，增删快
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("xixi");
		
		//treeSet，红黑树算法，擅长范围查询；不允许null；不保证元素的添加顺序，但会对存入其中的元素进行排序
		//底层是用treeMap实现
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("lalala");
		
		//解决Set实现类线程不安全：以hashSet为例
		Set<String> synchronizedSet = Collections.synchronizedSet(hashSet);
		for (String string : synchronizedSet) {
			System.out.println(string);
		}
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		//for循环,将set转换为数组后for输出
		String setArray[] = new String[hashSet.size()];
		hashSet.toArray(setArray);
		for (int i = 0; i < setArray.length; i++) {
			System.out.println(setArray[i]+"---");
		}
	}
}
