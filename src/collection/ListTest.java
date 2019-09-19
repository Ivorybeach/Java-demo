package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//list���򼯺�,�����ظ�,��Ϊnull
public class ListTest {

	public static void main(String[] args) {

		// ArrayList�ײ�ʵ���ǳ��ȿ��Ըı�����飬��ѯ�죬��ɾ��
		List<String> list1 = new ArrayList<>();

		// LinkedList�ײ�ʵ����������ѯ������ɾ��
		// �ṩ��ר�Ŷ�ͷβԪ�صĲ���
		List<String> list2 = new LinkedList<>();

		list1.add("hehe");
		list2.add("haha");

		// 1.for-each���
		for (String str1 : list1) {
			System.out.println(str1);
		}
		// 2.iterator�����Iteratorֻ����������ListIter����ǰ(previous())��������
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
			String str2 = iterator.next();
			System.out.println(str2);
		}
		// ListIterator���
		ListIterator<String> listIterator = list2.listIterator();
		while (listIterator.hasNext()) {
			String str3 = (String) listIterator.next();
			System.out.println(str3);
		}

		// forѭ�����
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + "----");
		}

	}
}
