package collection;

import java.util.Set;

//存入其中的元素会排序
public class TreeSet1 {
	public static void main(String[] args) {

		Set<String> treeSet = new java.util.TreeSet<>();
		treeSet.add("axx");
		treeSet.add("zdd");
		treeSet.add("cff");
		treeSet.add("145");
		treeSet.add("499");
		treeSet.add("223");

		//可见输出结果是经过排序
		for (String string : treeSet) {
			System.out.println(string);
		}
	}

}
