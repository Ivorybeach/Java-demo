package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import po.Person;
import po.Person2;

//treeMap储存自定义对象
//自定义类中必须实现Comparable()接口重写compareTo()或使用比较器Comparator，
//否则存入自定义对象会报java.lang.ClassCastException:
public class TreeSet2 {
	public static void main(String[] args) {
		Set<Person2> treeSet = new TreeSet<Person2>();
		
		Person2 per1 = new Person2("hehe",11);
		Person2 per2 = new Person2("haha",22);
		Person2 per3 = new Person2("hehe",11);
		
		treeSet.add(per1);
		treeSet.add(per2);
		treeSet.add(per3);
		
		//输出结果是按年龄排序的，因为在Person2中重写了compareTo()方法
		System.out.println("实现Comparable接口：");
		for (Person2 person2 : treeSet) {
			System.out.println(person2);
		}
		
		//使用比较器Comparator
		TreeSet<Person> treeSet2 = new TreeSet<Person>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1==o2) {
					return 0;	//o1=o2表示两个相同
				}
				int result = o1.getAge()-o2.getAge();
				if (result==0) {	//如果是0表示年龄相同，则按name长短排序
					return (o1.getName().length()-o2.getName().length());
				}
				return result;
			}
		});
		
		//首先按年龄排序，年龄相同按姓名长度排序
		treeSet2.add(new Person("hehe", 11));
		treeSet2.add(new Person("haha", 22));
		treeSet2.add(new Person("heheh", 11));
		
		System.out.println("使用比较器comparator：");
		for (Person person : treeSet2) {
			System.out.println(person);
		}
	}
}
