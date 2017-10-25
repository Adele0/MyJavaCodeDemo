package cn.itsource.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapStatistic {
	
	public static void main(String[] args) {
//		 统计str每个字符的个数
		String str = "sdfghjki65tgfdcaa";
		HashMap hm = new HashMap();//将出现的字符放入map
		for (int i = 0; i < str.length(); i++) {
//			循环取出每一个值
			char c = str.charAt(i);
//			判断是否是第一次添加
			if (hm.containsKey(c)) {
//				不是第一次添加,先取出value，再加一，再放回
				Object value = hm.get(c);
				hm.put(c,(int)value+1);
			}else{
//				第一次添加
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		System.out.println("-----------------");
		
		
//		打印出，次数最多的字符（即：找到value最大的）
		
//		方式1：values
		Collection values = hm.values();
		int max = 0;
		for (Object object : values) {
			int obj = (int)object;
			if (max < obj) {
				max = obj;
			}
		}
		System.out.println(max);
		System.out.println("-----------------");
		
//		方式2： Collection--->调用Collection的toArray方法，把Collection转化成数组
		Object[] array = values.toArray();
//		Object[]里面的最大值--》Arrays.sort(Objection[] array)
		Arrays.sort(array);
		System.out.println(array[array.length-1]);//最后一个数就是最大的
		System.out.println("-----------------");
		
//		方式3：Collections.max(Collection col)
		System.out.println(Collections.max(values));
		System.out.println("-----------------");
		
//		根据value找到对应key---》通过entrySet()或keySet()
		Set keys = hm.keySet();
		for (Object key : keys) {
			int value = (int)hm.get(key);
			if (value == max) {
				System.out.println(key + "-" + value);
			}
		}
	}
}
