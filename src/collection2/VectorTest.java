package collection2;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//Vector��ArrayList���̰߳�ȫ����
public class VectorTest {

	public static void main(String[] args) {
		
		List<String> vector = new Vector<>();
		
		vector.add("����");
		vector.add("�Ǻ�");
		vector.add("����");
		
		//forѭ������
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		//for-each
		for (String string : vector) {
			System.out.println(string);
		}
		//iterator
		for (Iterator iterator = vector.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		
	}
	
}
