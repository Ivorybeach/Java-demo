package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import po.Person;

public class HashSetTest {
	public static void main(String[] args) {
		
	Set<Person> hashSet = new HashSet<Person>();	
	
	//����һ���̰߳�ȫ��hashSet
	Set<Person> safeHashSet = Collections.synchronizedSet(hashSet);
	
	Person per1 = new Person("hehe",11);
	Person per2 = new Person("haha",22);
	Person per3 = new Person("hehe",11);
	
	

	
	//��ΪPerson������д��equals��hashCode�����Կ����ж�per1��per3����ͬ���󣬲����ظ�����
	hashSet.add(per1);
	hashSet.add(per2);
	hashSet.add(per3);
	
	String str = new String("ehe");
	String str1 = "ehe";
	System.out.println(str1==str);
	System.out.println(str1.equals(str));
	
	
	System.out.println(hashSet.size());
	//System.out.println(hashSet.toString());
	
	for (Person person : hashSet) {
		System.out.println(person.toString());
	}
	}
}
