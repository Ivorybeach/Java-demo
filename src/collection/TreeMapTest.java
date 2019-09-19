package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import po.Person;
import po.Person2;

//treeMap�ڲ��������������Զ��������Ҫ�̳�Comparatable�ӿڻ�ʹ��Comparator
public class TreeMapTest {
	
	public static void main(String[] args) {
		TreeMap<Person, String> treeMap = new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1==o2) {
					return 0;
				}
				int result = o1.getAge()-o2.getAge();
				if (result==0) {	//������ͬ������������
					return o1.getName().length()-o2.getName().length();
				}
				return result;
			}
		});
		
		
		treeMap.put(new Person("111",111),"heihei");
		
		
		
		//�Ȼ�ȡmap��entry��ŵ�set�У��ٽ�����Iterator���
		Set<Entry<Person, String>> entrySet = treeMap.entrySet();
		Iterator<Entry<Person, String>> entryIterator=entrySet.iterator();
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
	}
	
	
}
