package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import po.Person;
import po.Person2;

//treeMap�����Զ������
//�Զ������б���ʵ��Comparable()�ӿ���дcompareTo()��ʹ�ñȽ���Comparator��
//��������Զ������ᱨjava.lang.ClassCastException:
public class TreeSet2 {
	public static void main(String[] args) {
		Set<Person2> treeSet = new TreeSet<Person2>();
		
		Person2 per1 = new Person2("hehe",11);
		Person2 per2 = new Person2("haha",22);
		Person2 per3 = new Person2("hehe",11);
		
		treeSet.add(per1);
		treeSet.add(per2);
		treeSet.add(per3);
		
		//�������ǰ���������ģ���Ϊ��Person2����д��compareTo()����
		System.out.println("ʵ��Comparable�ӿڣ�");
		for (Person2 person2 : treeSet) {
			System.out.println(person2);
		}
		
		//ʹ�ñȽ���Comparator
		TreeSet<Person> treeSet2 = new TreeSet<Person>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1==o2) {
					return 0;	//o1=o2��ʾ������ͬ
				}
				int result = o1.getAge()-o2.getAge();
				if (result==0) {	//�����0��ʾ������ͬ����name��������
					return (o1.getName().length()-o2.getName().length());
				}
				return result;
			}
		});
		
		//���Ȱ���������������ͬ��������������
		treeSet2.add(new Person("hehe", 11));
		treeSet2.add(new Person("haha", 22));
		treeSet2.add(new Person("heheh", 11));
		
		System.out.println("ʹ�ñȽ���comparator��");
		for (Person person : treeSet2) {
			System.out.println(person);
		}
	}
}
