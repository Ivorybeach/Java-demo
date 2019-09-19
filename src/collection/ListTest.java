package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//list有序集合,可以重复,可为null
public class ListTest {

	public static void main(String[] args) {

		// ArrayList底层实现是长度可以改变的数组，查询快，增删慢
		List<String> list1 = new ArrayList<>();

		// LinkedList底层实现是链表，查询慢，增删快
		// 提供了专门对头尾元素的操作
		List<String> list2 = new LinkedList<>();

		list1.add("hehe");
		list2.add("haha");

		// 1.for-each输出
		for (String str1 : list1) {
			System.out.println(str1);
		}
		// 2.iterator输出，Iterator只能向后输出，ListIter可向前(previous())、向后输出
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
			String str2 = iterator.next();
			System.out.println(str2);
		}
		// ListIterator输出
		ListIterator<String> listIterator = list2.listIterator();
		while (listIterator.hasNext()) {
			String str3 = (String) listIterator.next();
			System.out.println(str3);
		}

		// for循环输出
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + "----");
		}

	}
}
