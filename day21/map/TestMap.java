package cn.itsource.map;

import java.util.HashMap;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new A(), "1");
		hm.put(new A(), "2");
		System.out.println("hushmap添加new（）类的个数："+hm.size());//2
		System.out.println("-------------------------------");
		 
		TreeMap tm = new TreeMap();
		tm.put("A", 1);
		tm.put("E", 2);
		tm.put("C", 3);
		tm.put("B", 4);
//		tm.put(new A(), 5);//报错：A cannot be cast to Comparable
		System.out.println(tm);
		
//		put方法的特点：如果key相等，value使用新值替代老值
//		hashMap：键不能重读，判断方法和hashSet一样，通过hashCode和equals
//		treeMap：键不能重读，打印有顺序，判断方法和hashSet一样，通过自然排序（Comparable）和定制排序(Comparator)。treeSet的底层通过treeMap实现
	}

}
 
class A{
	
}