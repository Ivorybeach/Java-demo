package collection;

import java.util.Set;

//�������е�Ԫ�ػ�����
public class TreeSet1 {
	public static void main(String[] args) {

		Set<String> treeSet = new java.util.TreeSet<>();
		treeSet.add("axx");
		treeSet.add("zdd");
		treeSet.add("cff");
		treeSet.add("145");
		treeSet.add("499");
		treeSet.add("223");

		//�ɼ��������Ǿ�������
		for (String string : treeSet) {
			System.out.println(string);
		}
	}

}
