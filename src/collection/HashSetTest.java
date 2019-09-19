package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import po.Person;

public class HashSetTest {
	public static void main(String[] args) {
		
	Set<Person> hashSet = new HashSet<Person>();	
	
	//返回一个线程安全的hashSet
	Set<Person> safeHashSet = Collections.synchronizedSet(hashSet);
	
	Person per1 = new Person("hehe",11);
	Person per2 = new Person("haha",22);
	Person per3 = new Person("hehe",11);
	
	

	
	//因为Person类中重写了equals和hashCode，所以可以判断per1与per3是相同对象，不会重复存入
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
