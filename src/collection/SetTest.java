package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set���򣬲���ͨ���±������ʣ�Ԫ����set�е�λ������hash�����,λ�ù̶�������һ��nullԪ�أ��������ظ�
public class SetTest {
	public static void main(String[] args) {
		
		//hashSet,����ѯʱ���ݹ�ϣ�����Ƚ�Ԫ�أ���ѯ�ٶȿ�
		//�ײ�����hashMapʵ��
		Set<String> hashSet = new HashSet<>();
		hashSet.add("heihei");
		
		//linkedHashSet,�ײ��������͹�ϣ���㷨�������ѯ������ɾ��
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("xixi");
		
		//treeSet��������㷨���ó���Χ��ѯ��������null������֤Ԫ�ص����˳�򣬵���Դ������е�Ԫ�ؽ�������
		//�ײ�����treeMapʵ��
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("lalala");
		
		//���Setʵ�����̲߳���ȫ����hashSetΪ��
		Set<String> synchronizedSet = Collections.synchronizedSet(hashSet);
		for (String string : synchronizedSet) {
			System.out.println(string);
		}
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		//forѭ��,��setת��Ϊ�����for���
		String setArray[] = new String[hashSet.size()];
		hashSet.toArray(setArray);
		for (int i = 0; i < setArray.length; i++) {
			System.out.println(setArray[i]+"---");
		}
	}
}
