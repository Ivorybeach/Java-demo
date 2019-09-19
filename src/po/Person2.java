package po;

//自定义对象
public class Person2 implements Comparable<Person2> {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//重写compareTo()，返回0表示相等，小于0表示小，大于0表示大
	//也可使用比较器comparator
	//定义按按年龄
	@Override
	public int compareTo(Person2 o) {
		int result = this.age-o.age;
		if (result==0) {
			return this.name.compareTo(o.name);
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "-----" + age;
	}
}
