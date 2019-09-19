package collection;

import java.util.HashSet;
import java.util.Set;

public class Test{
public static void main(String[] args) {
     Set<Integer> set=new HashSet<Integer>();
     set.add(1);
     set.add(2);
     set.add(1);
     System.out.println("集合的尺寸为:"+set.size());
     System.out.println("集合中的元素为:"+set.toString());
  }
}
