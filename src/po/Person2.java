package po;

//�Զ������
public class Person2 implements Comparable<Person2> {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//��дcompareTo()������0��ʾ��ȣ�С��0��ʾС������0��ʾ��
	//Ҳ��ʹ�ñȽ���comparator
	//���尴������
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
