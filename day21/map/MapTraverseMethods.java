package cn.itsource.map;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTraverseMethods {

	public static void main(String[] args) {
		// 遍历map的方式：
//		1.得到Entry对象（取到Entry里的所有的key和value）

		HashMap hm = new HashMap();
		hm.put("Bai", 17);
		hm.put("BLinai", 20);
		hm.put("Lin", 27);
		hm.put("Adele", 19);
		hm.put("Jiji", 21);
		Set entrys = hm.entrySet();
		for (Object entry : entrys) {
//			通过调用entry的方法--getKey和getValue
			Entry e = (Entry) entry;
			System.out.println(e.getKey()+ "-"+e.getValue());
		}
		
		System.out.println("---------------------------------");
		
//		2.使用keyset()方法--》get（key）;
		Set keys = hm.keySet();
		for (Object key : keys) {
			Object value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}

}
